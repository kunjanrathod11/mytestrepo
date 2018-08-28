************************************
Read Me File
************************************

1. Run the project DSGCEvents.jar with the following command:
~~~
	java -jar DSGCEvents.jar /your/absolute/location/to/system.log
~~~

2. The output should be similar to the following:
~~~
	[unix@linux]$ java -jar DSGCEvents.jar /your/absolute/location/to/system.log
				        The Number of GC events are : 284
                The median value of the gc latency from all GC events is : 237.5ms
~~~

3. The `loganalysis.sh` is another way to perform the same operation using shell script.

4. The output for the shell script is similar to:
~~~
sh loganalysis.sh

 One of the GC appearence in the log:
INFO x . x . GCInspector.java:XXX - G1 Young Generation GC in 110ms.

 The Number of GC events are :
284

 The median value of the gc latency from all GC events is :
137.5

~~~ 
