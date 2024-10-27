async function loadMovies() {
  try {
    const response = await fetch("http://localhost:8080/api/movies/getAll");
    const movies = await response.json();
    const gallery = document.getElementById("movieGallery");

    movies.forEach((movie) => {
      const movieCard = document.createElement("div");
      movieCard.classList.add("movie-card");

      movieCard.innerHTML = `
                <img src="${movie.thumbnail}" alt="${movie.title}" class="movie-thumbnail">
                <div class="movie-info">
                    <h4>${movie.title}</h4>
                    <p>${movie.category} | ${movie.language}</p>
                    <div class="buttons">
                        <button class="btn btn-book">Book Tickets</button>
                        <button class="btn btn-trailer" onclick="window.open('${movie.trailerVideo}', '_blank')">Watch Trailer</button>
                    </div>
                </div>
            `;

      gallery.appendChild(movieCard);
    });
  } catch (error) {
    console.error("Error fetching movies:", error);
  }
}

window.onload = loadMovies;
