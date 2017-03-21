![Build Status](https://travis-ci.org/justeat/mickeydb.svg)

# MickeyDB [PREVIEW]

With MickeyDB you can use a Sqlite like language to define and generate core Android database components to access and query your database.

MickeyDB generates implementations of SqliteOpenHelper, ContentProvider and a Contract class to help you access your data.

Additionally MickeyDB generates active record classes for each of your tables and views which allows you to access your data, in a strongly-typed way if you choose to do so.

Finally MickeyDB also generates useful ContentValues builders and also provides a useful fluent query API to make content provider queries a snap.

## Quick Start

You can start creating your database by adding a migration.

**src/takeaways1.mickey**
```none
database com.justeat.data.TakeawayDB

migrate initial {
	create table takeaways (_id integer primary key, name text);
}
```

Then later you might want to upgrade it

**src/takaways2.mickey**
```
database com.justeat.data.TakeawayDB version 1

migrate add_cuisines from initial {
  alter table takeaways add column cuisine text;
}
```

You need to add a file ending in init.mickey to satisfy the mickey assembler, for now we just need to define the database name.

**src/takeaways.init.mickey**
```none
database com.justeat.data.TakeawayDB version 1
```

Note: the ``mickey`` files should be in an ``src`` folder by default from your root folder (you can change this in the gradle build file that follows).

With our mickey files we can use a gradle script to generate our code.

**build.gradle**
```gradle
apply plugin: 'com.android.library'
apply plugin: 'org.xtext.android.builder'

dependencies {
    xtextLanguages 'com.justeat.mickeydb:com.justeat.mickeydb:1.0.13'
    compile ('com.justeat.mickeydb:com.justeat.mickeydb.lib:1.0.13')
}

android {
    compileSdkVersion 25
    buildToolsVersion "25.0.0"

    defaultConfig {
        minSdkVersion 14
        targetSdkVersion 25
    }
}

xtext {

    version = "2.11.0"

    languages {
        mickey {
            setup = 'com.justeat.mickeydb.MickeyLangStandaloneSetup'
        }
    }

    sourceSets {
        debug {
            srcDir 'src/main/model'
        }
        release {
            srcDir 'src/main/model'
        }
    }
}
```

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
