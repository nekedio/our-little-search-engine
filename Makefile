run-dev:
	./mvnw clean
	./mvnw install
	java -jar ./target/our-little-search-engine-*.jar
