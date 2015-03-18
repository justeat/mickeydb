![Build Status](https://travis-ci.org/justeat/mickeydb.svg)

# MickeyDB [PREVIEW]

With MickeyDB you can use a Sqlite like DSL to generate Android sqlite database backed content providers.

## Usage

Add your migrations in the same file or across seperate files as follows.

**src/books1.mickey**
````
database com.justeat.Books

migrate first_migration {
	create table books (_id integer primary key, name text);
}
````

**src/books2.mickey**
````
database com.justeat.Books

migrate second_migration from first_migration {
  alter table books add column author text;
}
````

You need to add a file ending in init.mickey to satisfy the mickey assembler, for now we just need to define the database name.

**src/books.init.mickey**
````
database com.justeat.Books
````

Note that both the above mickey files should be in an src folder by default from your root folder (you can change this in the gradle build file that follows).

Then in a gradle script we can invoke the assembler that will generate code (open helper, contract, content provider + more) that we can use to easily interact with an android sqlite database.

**build.gradle**
````gradle
buildscript {
  repositories {
      mavenCentral()
  }
  
  dependencies {
    classpath "org.xtext:xtext-gradle-plugin:0.1.1"
  }
}

apply plugin: "org.xtext.xtext"

repositories {
    mavenCentral()
    maven {
        url "https://oss.sonatype.org/content/repositories/snapshots"
    }
}
  
dependencies {
  xtextTooling 'com.justeat.mickeydb:com.justeat.mickeydb:1.0.0-SNAPSHOT'
}
 
xtext {
  version = '2.7.3'
  sources {
    srcDir 'src'
  }
  
  languages{
    mickey {
      setup = 'com.justeat.mickeydb.MickeyLangStandaloneSetup'
      output.dir = 'build/mickey'
    }
  }
}
````

Run ```gradle assemble```, code should be generated into the ```build/mickey``` output folder as specified in the gradle build file.

## License

### Eclipse Plugin Components
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the Eclipse Public License v1.0
    which accompanies this distribution, and is available at
       
       http://www.eclipse.org/legal/epl-v10.html

### Mickey Android Runtime Library
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
