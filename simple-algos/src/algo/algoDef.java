package algo;

import props.Product;

public class algoDef {
	
	public static int findLowerValue(Product[] products, int ini, int end) {
		int lowerValue = ini;

        for (int i = ini ; i < end ; i++) {
        	if(products[lowerValue].getPrice() > products[i].getPrice()) {
        		lowerValue = i;
        	}
        }
		return lowerValue;
	}
	
	public static void selectionSort(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {

            int lower = findLowerValue(products, i, products.length);

            Product actual = products[i];
            Product lowerProduct = products[lower];

            products[i] = lowerProduct;
            products[lower] = actual;
        }

        for (Product product : products) {
            System.out.println(product.getName() + " custa " + product.getPrice());
        }
        	
	}
	
	public static void insertionSort(Product[] products) {
		
        for (int i = 0; i < products.length; i++) {
        	
        	Product key = products[i];
        	int j = i - 1;
        	
        	while (j >= 0 && products[j].getPrice() > key.getPrice()) {
                products[j + 1] = products[j];
                j = j - 1;
            }
            products[j + 1] = key;
        }

        for (Product product : products) {
            System.out.println(product.getName() + " custa " + product.getPrice());
        }
        	
	}

	private static void merge(Product[] products, int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;
 
        Product L[] = new Product[n1];
        Product R[] = new Product[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = products[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = products[m + 1 + j];
 
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getPrice() <= R[j].getPrice()) {
                products[k] = L[i];
                i++;
            }
            else {
                products[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            products[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            products[k] = R[j];
            j++;
            k++;
        }
    }
 
	public static void mergeSort(Product[] products, int l, int r){
		
		if (l < r) {
            int m =l+ (r-l)/2;
 
            mergeSort(products, l, m);
            mergeSort(products, m + 1, r);
 
            merge(products, l, m, r);
        }
    }
	
	public static void printOrder(Product[] products) {
		for (Product product : products) {
            System.out.println(product.getName() + " custa " + product.getPrice());
        }
	}
	
	public static void quickSort(Product[] products, int ini, int end) {
		if(end > ini) {
			int pivot = divide(products, ini, end);
			quickSort(products, ini, pivot - 1);
			quickSort(products, pivot + 1, end);
		}
	}
	
	private static int divide(Product[] products, int ini, int end) {
		int left, right = end;
		left = ini + 1;
		Product pivot = products[ini];

		while(left <= right) {

			while(left <= right && products[left].getPrice() <= pivot.getPrice()) {
				left++;
			}

			while(right >= left && products[right].getPrice() > pivot.getPrice()) {
				right--;
			}

			if(left < right) {
				swap(products, right, left);
				left++;
				right--;
			}
		}

		swap(products, ini, right);
		return right;
	}
	
	private static void swap(Product[] products, int i, int j) {
		Product aux = products[i];
		products[i] = products[j];
		products[j] = aux;
	}
	
	public static void linearSearch(Product[] products,  int ini, int end, int target) {
		for (int i = ini; i < end; i++) {
			if(products[i].getPrice() == target) {
				System.out.println("In position "+i);
			}
		}
		System.out.println("Not found");
	}
	
	public int runBinarySearchIteratively(
			  int[] sortedArray, int key, int low, int high) {
			    int index = Integer.MAX_VALUE;
			    
			    while (low <= high) {
			        int mid = low  + ((high - low) / 2);
			        if (sortedArray[mid] < key) {
			            low = mid + 1;
			        } else if (sortedArray[mid] > key) {
			            high = mid - 1;
			        } else if (sortedArray[mid] == key) {
			            index = mid;
			            break;
			        }
			    }
			    return index;
			}
}
