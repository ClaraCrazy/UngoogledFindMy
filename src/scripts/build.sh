#!/bin/bash

# This script is used to build the project.

cd ../
rm app/release/UngoogledFindMy.apk
gradlew build --warning-mode all
java -jar scripts/signer.jar -a app/build/outputs/apk/release/app-release-unsigned.apk -o app/release/
mv app/release/app-release-aligned-debugSigned.apk app/release/UngoogledFindMy.apk
rm app/release/app-release-aligned-debugSigned.apk.idsig

echo Done!
