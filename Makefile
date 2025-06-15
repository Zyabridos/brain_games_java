run-dist:
	cd app && ./gradlew clean installDist && ./build/install/app/bin/app

install-dist:
	cd app && ./gradlew installDist

clean:
	cd app && ./gradlew clean
