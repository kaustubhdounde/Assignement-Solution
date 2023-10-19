function reverseWordsManually(sentence) {
  if (typeof sentence !== "string") {
    return "Input is not a valid string.";
  }

  let reversedSentence = "";
  let reversedWord = "";

  for (let i = 0; i < sentence.length; i++) {
    const currentChar = sentence[i];

    // If the current character is a space or the last character
    if (currentChar === " " || i === sentence.length - 1) {
      // Add the reversed word to the reversed sentence
      reversedSentence =
        reversedSentence +
        reversedWord +
        (i === sentence.length - 1 ? currentChar : " ");

      // Reset the reversed word for the next word
      reversedWord = "";
    } else {
      // Prepend the current character to the reversed word
      reversedWord = currentChar + reversedWord;
    }
  }

  return reversedSentence;
}

// Example usage:
const inputSentence = "Hello World";
const reversedSentence = reverseWordsManually(inputSentence);
console.log(reversedSentence);
