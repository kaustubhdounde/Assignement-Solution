function descendingBubbleSort(arr) {
  const n = arr.length;
  let swapped;

  do {
    swapped = false;
    for (let i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        // Swap the elements
        const temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true;
      }
    }
  } while (swapped);

  return arr;
}

// Example usage:
const unsortedArray = [5, 2, 9, 3, 6];
const sortedArray = descendingBubbleSort(unsortedArray);
console.log(sortedArray);
