async function loadMovies() {
  try {
    const response = await fetch("http://localhost:8080/api/movies/getAll");
    const movies = await response.json();
    const gallery = document.getElementById("movieGallery");

    movies.forEach((movie, index) => {
      const movieCard = document.createElement("div");
      movieCard.classList.add("movie-card");

      movieCard.innerHTML = `
                    <img src="${movie.thumbnail}" alt="${movie.title}" class="movie-thumbnail">
                    <div class="movie-info">
                        <h4>${movie.title}</h4>
                        <p>${movie.category} | ${movie.language}</p>
                        <div class="buttons">
                            <button class="btn btn-book">Book Tickets</button>
                            <button class="btn btn-trailer" onclick="watchTrailer('${movie.trailerVideo}')">Watch Trailer</button>
                        </div>
                    </div>
                `;

      gallery.appendChild(movieCard);
    });
  } catch (error) {
    console.error("Error fetching movies:", error);
  }
}

function watchTrailer(url) {
  window.open(url, "_blank");
}

window.onload = loadMovies;
function watchTrailer(url) {
  const modal = document.getElementById("trailerModal");
  const trailerVideo = document.getElementById("trailerVideo");

  // Set the video URL in the iframe
  trailerVideo.src = url;

  // Display the modal
  modal.style.display = "block";
}

// Close modal when the close button is clicked
document.querySelector(".close").onclick = function () {
  closeModal();
};

// Close modal when clicking outside the modal content
window.onclick = function (event) {
  const modal = document.getElementById("trailerModal");
  if (event.target === modal) {
    closeModal();
  }
};

function closeModal() {
  const modal = document.getElementById("trailerModal");
  const trailerVideo = document.getElementById("trailerVideo");

  // Hide the modal
  modal.style.display = "none";

  // Stop the video by removing the src attribute
  trailerVideo.src = "";
}
