const textElement = document.getElementById('animated-description');
const text = "Create Multiple Folders Easily.";

function typeWriter(text, i = 0) {
  if (i < text.length) {
    textElement.textContent += text.charAt(i);
    i++;
    setTimeout(() => typeWriter(text, i), 50); // Adjust typing speed here
  }
}

typeWriter(text);
