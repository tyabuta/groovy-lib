
versionDir=$1
if [ -z "$versionDir" ]; then
    echo "usage: cmd VERSION"
    exit -1
fi

jarDir=build/net/tyfunction/groovy-lib/$versionDir
packageDir=build/package/$versionDir

mkdir -p $packageDir
cp $jarDir/*.jar $packageDir/
cp $jarDir/*.pom $packageDir/


