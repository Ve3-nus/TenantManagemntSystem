TenantManagementSystem - BBT3202 Lesson 6 (final version, Data Binding)

HOW TO USE
1. Create the project in Android Studio (Empty Views Activity, Kotlin), package:
   com.example.tenantmanagementsystemgroupa
   (If your package differs, change it in all 3 files + the <variable type="..."> line.)
2. Apply the Gradle changes in build.gradle.kts.module-app-CHANGES.txt, then Sync Now.
3. Copy these files over yours:
   app/src/main/java/com/example/tenantmanagementsystemgroupa/MainActivity.kt
   app/src/main/java/com/example/tenantmanagementsystemgroupa/Tenant.kt   (new file)
   app/src/main/res/layout/activity_main.xml
4. Build > Rebuild Project, then Run.

EXPECTED
- Opens with grey hint "Saved tenant will appear here".
- John Kamau / 0712345678 / 25000 -> SAVE shows:
    Tenant: John Kamau
    Phone: 0712345678
    Rent: KSh 25000
