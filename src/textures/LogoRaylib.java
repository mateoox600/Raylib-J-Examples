package textures;

import com.raylib.java.Raylib;
import com.raylib.java.core.Color;
import com.raylib.java.textures.Texture2D;

public class LogoRaylib{

    /*******************************************************************************************
     *
     *   raylib-j [textures] example - Texture loading and drawing
     *
     *   This example has been created using raylib 1.0 (www.raylib.com)
     *   raylib is licensed under an unmodified zlib/libpng license (View raylib.h for details)
     *
     *   Copyright (c) 2014 Ramon Santamaria (@raysan5)
     *
     ********************************************************************************************/


    public static void main(String[] args){
        // Initialization
        //--------------------------------------------------------------------------------------
        final int screenWidth = 800;
        final int screenHeight = 450;

        Raylib rlj = new Raylib(screenWidth, screenHeight, "raylib-j [textures] example - texture loading and drawing");

        // NOTE: Textures MUST be loaded after Window initialization (OpenGL context is required)
        Texture2D texture = rlj.textures.LoadTexture("resources/raylib-j_logo.png");        // Texture loading
        //---------------------------------------------------------------------------------------

        // Main game loop
        while (!rlj.core.WindowShouldClose()) {   // Detect window close button or ESC key

            // Update
            //----------------------------------------------------------------------------------
            // TODO.txt: Update your variables here
            //----------------------------------------------------------------------------------

            // Draw
            //----------------------------------------------------------------------------------
            rlj.core.BeginDrawing();

            rlj.core.ClearBackground(Color.RAYWHITE);

            rlj.textures.DrawTexture(texture, screenWidth/2 - texture.width/2, screenHeight/2 - texture.height/2,
                    Color.WHITE);

            rlj.text.DrawText("this IS a texture!", 360, 370, 10, Color.GRAY);

            rlj.core.EndDrawing();
            //----------------------------------------------------------------------------------
        }

        // De-Initialization
        //--------------------------------------------------------------------------------------
        rlj.textures.UnloadTexture(texture);       // Texture unloading

    }

}