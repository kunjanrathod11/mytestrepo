#!/bin/bash

echo -e "\n One of the GC appearence in the log":
cat system.log | grep --ignore-case GCInspector.java | grep ms | head -1
sleep 1

echo -e "\n The Number of GC events are :"
cat system.log | grep --ignore-case GCInspector.java | grep ms | wc -l
sleep 1

echo -e "\n The median value of the gc latency from all GC events is :"
cat system.log | grep --ignore-case GCInspector.java | grep ms | awk '{print substr($13,1,3)}' | sort -n | awk ' { a[i++]=$1; } END { x=int((i+1)/2); if (x < (i+1)/2) print (a[x-1]+a[x])/2; else print a[x-1]; }'
sleep 1
echo -e "\n"
