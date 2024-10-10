# Some good methods learned from leetcode problems

System.gc() -> run garbage collection. Good for memory but not good for runtime. <br>
 <br>
System.arraycopy() -> optimize a copy array method. Good for memory and runtime. <br>
 <br>
usage of method -> <br>
public static void arraycopy(Object source_arr, int sourcePos, <br>
                            Object dest_arr, int destPos, int len)<br>
Parameters : <br>
source_arr : array to be copied from<br>
sourcePos : starting position in source array from where to copy<br>
dest_arr : array to be copied in<br>
destPos : starting position in destination array, where to copy in<br>
len : total no. of components to be copied.<br>
