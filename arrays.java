int[] arrInts = {4, 2, 8, 5};
int[] newArray = new int[4];
newArray[0] = 12;
newArray[1] = 13;
newArray[2] = 45;
newArray[3] = 23;
for (int i = 0; i <arrInts.length; i++) {
			System.out.println("unsorted numbers : " + arrInts[i]);
		}
		Arrays.sort(arrInts);
		
		for (int i = 0; i <arrInts.length; i++) {
			System.out.println("Sorted numbers : " + arrInts[i]);
		}