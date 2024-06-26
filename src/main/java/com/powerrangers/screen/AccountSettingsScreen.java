package com.powerrangers.screen;

import java.util.Scanner;

import com.powerrangers.AppContext;
import com.powerrangers.util.*;

public class AccountSettingsScreen implements ScreenBase
{
    @Override
    public void show(AppContext appContext)
    {
        System.out.println("Configuración de cuenta");

        Menu menu = appContext.createMenu()
            .AddItem("1", "Regresar a pantalla anterior")
            .AddItem("3", "Borrar cuenta")
            .AddItem("2", "Ir a menú principal");

        switch (menu.show()) 
        {
            case "1":
                appContext.goToPreviousScreen();
                break;
            case "2":
                appContext.goToScreen(ScreenOption.MainScreen);
                break;
            default:
                break;
        }
    }
}
