# App Store Reviews Parser

### Overview
This is an application (written in Java) that allows you to export all reviews for specified set of apps into xlsx file (MS Excel)

### How to use
You need to replace id's in the array that you can find in a link `https://itunes.apple.com/app/<app-name>/id<app-id>?mt=8` and run the program. When application parse all data you will get a file reviews.xlsx

`private static final long[] apps = {464256240, 571689619}; // add your apps there`

### License
Copyright 2015 Lapshov Ivan

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
