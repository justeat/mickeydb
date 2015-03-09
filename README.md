![Build Status](https://travis-ci.org/justeat/mickeydb.svg)

# mickeydb

##Provisional documentation, in order for this to work you need to ```mvn install``` mickeydb into your local repo

A DSL powered code generator for Android sqlite databases. With MickeyDB you can define your migrations like this:

**src/books.1.mickey**
````
database com.justeat.Books

migration 1 {
	create table books (_id integer primary key, name text);
}
````

You need to add a file ending in init.mickey, this is the mickey assemblers entry point, for now we just need to define the database name.

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
      maven {
          url "https://oss.sonatype.org/content/repositories/snapshots"
      }
  }
  
  dependencies {
    classpath "org.xtext:xtext-gradle-plugin:0.1.1"
  }
}

apply plugin: "org.xtext.xtext"

repositories {
  	mavenLocal()
    mavenCentral()
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

License
=======

Eclipse Plugin Components
-------------------------
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the Eclipse Public License v1.0
    which accompanies this distribution, and is available at
       
       http://www.eclipse.org/legal/epl-v10.html
