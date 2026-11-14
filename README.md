# Tenant Management System

An Android app for managing tenants and rent, built in Kotlin for
BBT 3.2 Mobile Application Development at Strathmore University.

## Features
- Login and Register screens
- Dashboard showing the tenant count and total rent
- Add Tenant form with input validation
- View Tenants screen listing all saved tenants
- CALL TENANT button that opens the phone dialer
- Options menu and navigation drawer
- Local data storage with Room

## Architecture
UI (Fragments, XML, Data Binding) -> ViewModel (LiveData) -> Repository -> Room database

## Tech Stack
Kotlin, Navigation Component with Safe Args, Data Binding, Room,
ViewModel and LiveData, Material Components

## Project Structure
- `app/src/main/java/com/example/tenantmanagementsystem/` Kotlin source code
- `app/src/main/res/layout/` XML layouts
- `app/src/main/res/navigation/nav_graph.xml` navigation graph
- `app/src/main/res/menu/` options menu and drawer menu

## Team
| Member | Role |
|---|---|
| Venus Kabera | Project lead, GitHub, Navigation |
| Mapelu Joe | UI and layouts |
| Abraham Kwikiriza | UI and layouts |
| Boniface Mwangi | Room database |
| Dollan James Ochele | Repository and ViewModel |
| Brian Omoto | API and networking |
| Ryan | Background tasks and SOS |

## How to Run
1. Clone the repository:
   `git clone https://github.com/Ve3-nus/TenantManagemntSystem.git`
2. Open it in Android Studio and click **Sync Now**.
3. Go to **Build → Rebuild Project**.
4. Choose an emulator or a connected device and click **Run**.

## Git Workflow
- Each task is built on its own `feature/...` branch.
- Changes are merged into the main branch through Pull Requests reviewed by the project lead.
- No direct commits to the main branch.