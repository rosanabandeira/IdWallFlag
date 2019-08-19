package android.studio.idwallflag.api;

import android.studio.idwallflag.models.CategoryResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface API {

    @GET("/feed")
    @Headers({"Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJpZGRvZy1zZXJ2aWNlIiwic3ViIjoiNWQ1MDExMmE0NzRkYWE2ZjdmYjIwMTYwIiwiaWF0IjoxNTY1NTI4MzYyLCJleHAiOjE1NjY4MjQzNjJ9.VjDhiHKDSU1vMp5fmyS7Kh8-LUsOQsekwLI1k6MrPdg", "Content-Type: application/json"})
    Call<CategoryResponse> categoryResponse();

    @GET("/feed")
    @Headers({"Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJpZGRvZy1zZXJ2aWNlIiwic3ViIjoiNWQ1MDExMmE0NzRkYWE2ZjdmYjIwMTYwIiwiaWF0IjoxNTY1NTI4MzYyLCJleHAiOjE1NjY4MjQzNjJ9.VjDhiHKDSU1vMp5fmyS7Kh8-LUsOQsekwLI1k6MrPdg", "Content-Type: application/json"})
    Call<CategoryResponse> categoryresponsehound(@Query("category") String dog);

    @GET("/feed")
    @Headers({"Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJpZGRvZy1zZXJ2aWNlIiwic3ViIjoiNWQ1MDExMmE0NzRkYWE2ZjdmYjIwMTYwIiwiaWF0IjoxNTY1NTI4MzYyLCJleHAiOjE1NjY4MjQzNjJ9.VjDhiHKDSU1vMp5fmyS7Kh8-LUsOQsekwLI1k6MrPdg", "Content-Type: application/json"})
    Call<CategoryResponse> categoryresponselabrador(@Query("category") String dog);

    @GET("/feed")
    @Headers({"Authorization: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJpZGRvZy1zZXJ2aWNlIiwic3ViIjoiNWQ1MDExMmE0NzRkYWE2ZjdmYjIwMTYwIiwiaWF0IjoxNTY1NTI4MzYyLCJleHAiOjE1NjY4MjQzNjJ9.VjDhiHKDSU1vMp5fmyS7Kh8-LUsOQsekwLI1k6MrPdg", "Content-Type: application/json"})
    Call<CategoryResponse> categoryresponsepug(@Query("category") String dog);

}
