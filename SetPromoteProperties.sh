#!/bin/sh

# grab gradle variables
version=`grep -e ^version build.gradle | awk -F\' '{print \$2}'`
project_name=`grep -e ^rootProject.name settings.gradle | awk -F\' '{print \$2}'`

echo "PROJECT_NAME=${project_name}" > promote.properties
echo "VERSION=${version}" >> promote.properties

echo "current project name: $project_name"
echo "current version: $version"