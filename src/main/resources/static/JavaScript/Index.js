let currentIndex = 0;

function showImage(index) {

    const images = document.getElementById('carouselImages');
    const totalImages = images.children.length;
    if (index >= totalImages) currentIndex = 0;
    if (index < 0) currentIndex = totalImages - 1;
    images.style.transform = `translateX(-${currentIndex * 100}%)`;
}

function nextImage() {

    currentIndex = currentIndex + 1;
    showImage(currentIndex);
}

function prevImage() {

    currentIndex--;
    showImage(currentIndex);
}