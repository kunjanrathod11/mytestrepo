# GC Event Median Analysis using Java Programming


** Use the command to build the project:
~~~
mvn clean install
~~~

** Use the `DSGCEventProject-X.X.X-SNAPSHOT.jar` to analyse system.log file.

[note] : there will be an example system.log file in the recources folder.

1. Run the project DSGCEvents.jar with the following command:
~~~
	java -jar DSGCEventProject-X.X.X-SNAPSHOT.jar
~~~
[note] : Place the system.log file in the resources folder or replace the one(Example) which already exists.

2. The output should be similar to the following:
~~~
	[unix@linux]$ java -jar DSGCEventProject-X.X.X-SNAPSHOT.jar
				        The Number of GC events are : 284
                The median value of the gc latency from all GC events is : 137.5ms
~~~
