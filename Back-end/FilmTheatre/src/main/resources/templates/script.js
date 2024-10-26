// script.js
document.addEventListener("DOMContentLoaded", () => {
    const apiUrl = "http://localhost:8080/api/movies"; // Update if using a different port or domain

    fetch(apiUrl)
        .then(response => response.json())
        .then(movies => {
            const moviesTableBody = document.getElementById("moviesTableBody");

            // Populate the table with movie data
            movies.forEach(movie => {
                const row = document.createElement("tr");

                row.innerHTML = `
                    <td><img src="${movie.thumbnail}" alt="Movie Thumbnail" class="thumbnail"></td>
                    <td>${movie.title}</td>
                    <td>${movie.category}</td>
                    <td>${movie.language}</td>
                    <td><a href="${movie.trailerVideo}" target="_blank">Watch Trailer</a></td>
                `;

                moviesTableBody.appendChild(row);
            });
        })
        .catch(error => console.error("Error fetching movies:", error));
});
