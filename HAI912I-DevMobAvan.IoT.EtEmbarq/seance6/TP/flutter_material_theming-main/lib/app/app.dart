import 'package:flutter/material.dart';
import 'package:flutter_material_theming/material_showcase/material_showcase.dart';
import 'package:google_fonts/google_fonts.dart';

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    /// Typography generator
    /// https://material.io/design/typography/the-type-system.html#type-scale
    const textTheme = TextTheme(
      headline1: TextStyle(
        fontSize: 98,
        fontWeight: FontWeight.w300,
        letterSpacing: -1.5,
      ),
      headline2: TextStyle(
        fontSize: 61,
        fontWeight: FontWeight.w300,
        letterSpacing: -0.5,
      ),
      headline3: TextStyle(
        fontSize: 49,
        fontWeight: FontWeight.w400,
      ),
      headline4: TextStyle(
        fontSize: 35,
        fontWeight: FontWeight.w400,
        letterSpacing: 0.25,
      ),
      headline5: TextStyle(
        fontSize: 24,
        fontWeight: FontWeight.w400,
      ),
      headline6: TextStyle(
        fontSize: 20,
        fontWeight: FontWeight.w500,
        letterSpacing: 0.15,
      ),
      subtitle1: TextStyle(
        fontSize: 16,
        fontWeight: FontWeight.w400,
        letterSpacing: 0.15,
      ),
      subtitle2: TextStyle(
        fontSize: 14,
        fontWeight: FontWeight.w500,
        letterSpacing: 0.1,
      ),
      bodyText1: TextStyle(
        fontSize: 16,
        fontWeight: FontWeight.w400,
        letterSpacing: 0.5,
      ),
      bodyText2: TextStyle(
        fontSize: 14,
        fontWeight: FontWeight.w400,
        letterSpacing: 0.25,
      ),
      button: TextStyle(
        fontSize: 14,
        fontWeight: FontWeight.w500,
        letterSpacing: 1.25,
      ),
      caption: TextStyle(
        fontSize: 12,
        fontWeight: FontWeight.w400,
        letterSpacing: 0.4,
      ),
      overline: TextStyle(
        fontSize: 10,
        fontWeight: FontWeight.w400,
        letterSpacing: 1.5,
      ),
    );

    //------------------------------- COLOR SCHEME ----------------------------
    const colorScheme = ColorScheme.highContrastLight(
      primary: Color(0xFF5D1049),
      secondary: Color(0xFFE30425),
      primaryVariant: Color(0xFF5D1049),
      secondaryVariant: Color(0xFFE30425),
      surface: Color(0xFFFFFFFF),
      background: Color(0xFFF4E2ED),
      error: Color(0xFFB00020),
      onPrimary: Color(0xFFFFFFFF),
      onSecondary: Color(0xFFFFFFFF),
      onSurface: Color(0xFF000000),
      onError: Color(0xFFFD9726),
      onBackground: Color(0xFF000000),
      brightness: Brightness.light,
    );

    /// Shape Customization tool
    /// https://material.io/design/shape/about-shape.html#shape-customization-tool

    //------------------------------- BUTTONS ----------------------------

    // NEW API THEME FOR BUTTONS
    // https://flutter.dev/docs/release/breaking-changes/buttons
    final elevatedButtonTheme = ElevatedButtonThemeData(
      style: ButtonStyle(
        shape: MaterialStateProperty.all<OutlinedBorder>(
          RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(10),
          ),
        ),
      ),
    );

    final textButtonTheme = TextButtonThemeData(
      style: ButtonStyle(
        shape: MaterialStateProperty.all<OutlinedBorder>(
          RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(10),
          ),
        ),
      ),
    );

    final outlineButtonTheme = OutlinedButtonThemeData(
      style: ButtonStyle(
        shape: MaterialStateProperty.all<OutlinedBorder>(
          RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(10),
          ),
        ),
      ),
    );

    //------------------------------- FABS ----------------------------
    const floatingActionButtonTheme = FloatingActionButtonThemeData(
      elevation: 10,
    );

    //------------------------------- CARD ----------------------------
    final cardTheme = CardTheme(
      elevation: 2,
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(16),
      ),
    );

    //------------------------------- CARD ----------------------------
    final inputDecorationTheme = InputDecorationTheme(
      border: OutlineInputBorder(
        borderRadius: BorderRadius.circular(20),
      ),
    );

    //------------------------------- DIALOG ----------------------------
    final dialogTheme = DialogTheme(
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(16),
      ),
    );

    //------------------------------- SNACKBAR ----------------------------
    final snackBarTheme = SnackBarThemeData(
      behavior: SnackBarBehavior.floating,
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(20),
      ),
    );

    //------------------------------- SNACKBAR ----------------------------
    final tabBarTheme = TabBarTheme(
      labelColor: colorScheme.secondary,
      unselectedLabelColor: colorScheme.onBackground,
      indicator: BoxDecoration(
        border: Border(
          bottom: BorderSide(
            color: colorScheme.primary,
            width: 2,
          ),
        ),
      ),
    );

    //------------------------------- SWITCH ----------------------------
    final switchTheme = SwitchThemeData(
      thumbColor: MaterialStateProperty.all<Color>(colorScheme.primary),
      trackColor: MaterialStateProperty.all<Color>(colorScheme.onError),
    );

    final checkBoxTheme = CheckboxThemeData(
      fillColor: MaterialStateProperty.all<Color>(colorScheme.primary),
      checkColor: MaterialStateProperty.all<Color>(colorScheme.onPrimary),
    );

    final themeData = ThemeData(
      textTheme: GoogleFonts.ralewayTextTheme(textTheme),
      colorScheme: colorScheme,
      primaryColor: colorScheme.primary,
      backgroundColor: colorScheme.background,
      elevatedButtonTheme: elevatedButtonTheme,
      textButtonTheme: textButtonTheme,
      outlinedButtonTheme: outlineButtonTheme,
      floatingActionButtonTheme: floatingActionButtonTheme,
      cardTheme: cardTheme,
      inputDecorationTheme: inputDecorationTheme,
      dialogTheme: dialogTheme,
      snackBarTheme: snackBarTheme,
      switchTheme: switchTheme,
      scaffoldBackgroundColor: colorScheme.background,
      tabBarTheme: tabBarTheme,
      checkboxTheme: checkBoxTheme,
    );
    return MaterialApp(
      title: 'Flutter Demo',
      theme: themeData,
      home: const MaterialShowcasePage(),
    );
  }
}
