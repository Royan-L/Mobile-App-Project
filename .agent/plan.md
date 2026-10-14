# Project Plan

Lesson 7 Practical — Authentication & Intents in Tenant Management App using Android XML, ConstraintLayout, View Binding, Data Binding, and Activities.

## Project Brief

# Project Brief: Tenant Management App (MVP)

## Features
1. **User Authentication**: Login and registration flows using Android Activities to securely authenticate users.
2. **Tenant Directory & Details View**: Display tenant information in structured layouts using Data Binding to link tenant data directly to UI components.
3. **Intent-Based Communication**: Trigger implicit Android Intents for tenant contact actions such as phone calls, SMS messaging, and emailing.
4. **Screen Navigation**: Use explicit Intents to seamlessly navigate between app screens (Auth, Dashboard, Tenant Profile).

## High-Level Tech Stack
- **Language**: Kotlin
- **UI Architecture & Layouts**: Android XML Layouts, ConstraintLayout
- **Data & View Binding**: View Binding and Data Binding
- **Core Architecture**: Android Activities, Kotlin Coroutines, LiveData / ViewModel
- **Navigation & System Integration**: Explicit Intents (Activity-to-Activity navigation) and Implicit Intents (Phone, Email, SMS)

## Implementation Steps
**Total Duration:** 73h 16m 55s

### Task_1_SetupBindingAndDataModel: Enable View Binding and Data Binding in build.gradle.kts, sync project, and create the Tenant data model class (Tenant.kt) with name, phone, rent fields and summary() method.
- **Status:** COMPLETED
- **Updates:** Enabled viewBinding and dataBinding in build.gradle.kts. Created Tenant.kt model class in package com.example.mobileappassignment with name, phone, rent properties and summary() returning 'Rent paid: KSh $rent'. Debug build succeeded.
- **Acceptance Criteria:**
  - viewBinding and dataBinding enabled in build.gradle.kts
  - Tenant data model created with summary method returning 'Rent paid: KSh $rent'
  - build pass
- **Duration:** 10m 16s

### Task_2_ImplementDataBindingLayout: Create activity_main.xml layout using ConstraintLayout wrapped in layout and data tags with Tenant variable. Include input fields for Name, Phone, Rent, SAVE button, bold Name display, and Summary display TextView.
- **Status:** COMPLETED
- **Updates:** Created activity_main.xml layout wrapped in <layout> and <data> tags with Tenant variable, ConstraintLayout, input fields, SAVE button, tenantDisplayNameTextView showing tenant.name in large bold text, and tenantResultTextView showing tenant.summary(). assembleDebug build passed.
- **Acceptance Criteria:**
  - activity_main.xml implemented with Data Binding layout and ConstraintLayout
  - UI includes Name, Phone, Rent fields, SAVE button, bold name display, and summary display
  - build pass
- **Duration:** 5m 34s

### Task_3_ImplementMainActivityLogic: Implement MainActivity interactivity: set up ActivityMainBinding, handle SAVE button click, validate required tenant name field, create Tenant instance, update binding data, and clear input fields.
- **Status:** COMPLETED
- **Updates:** Implemented MainActivity.kt with ActivityMainBinding inflation, SAVE button listener, name validation with error message, Tenant model instantiation, binding variable updates, and input clearing. Verified assembleDebug and unit tests passed.
- **Acceptance Criteria:**
  - SAVE button click validates non-empty tenant name
  - Tenant instance created and assigned to layout binding
  - Input fields cleared upon saving
  - make sure all existing tests pass
  - build pass
- **Duration:** 4m 20s

### Task_4_RunAndVerify: Run and verify the Tenant Management Screen app, instruct critic_agent to verify application stability (no crashes), confirm alignment with user requirements, and report critical UI issues.
- **Status:** COMPLETED
- **Updates:** All implementation steps and Try It Yourself requirements completed. App successfully built and ran on device/emulator without errors.
- **Acceptance Criteria:**
  - app does not crash
  - build pass
  - make sure all existing tests pass
  - all features verified
- **Duration:** 72h 36m 51s

### Task_5_ImplementAuthAndIntents: Implement LoginActivity and RegisterActivity with layouts (activity_login.xml, activity_register.xml), explicit intents for screen navigation, ACTION_VIEW for external link, and update AndroidManifest.xml launcher. Update MainActivity with login email Toast, full field validation, and CALL TENANT (ACTION_DIAL) / SHARE (ACTION_SEND) implicit intents.
- **Status:** COMPLETED
- **Updates:** Implemented LoginActivity, RegisterActivity, activity_login.xml, activity_register.xml, AndroidManifest.xml launcher updates, and MainActivity updates for Login Toast, full field validation, CALL TENANT (ACTION_DIAL), and SHARE (ACTION_SEND). Build passed cleanly.
- **Acceptance Criteria:**
  - LoginActivity and RegisterActivity created with XML layouts
  - LoginActivity set as launcher activity in AndroidManifest.xml
  - Explicit intents navigate between LoginActivity, RegisterActivity, and MainActivity passing email extra
  - ACTION_VIEW implicit intent opens website link from LoginActivity
  - MainActivity displays Toast on launch with logged in email and validates Name, Phone, Rent fields
  - CALL TENANT uses ACTION_DIAL and SHARE uses ACTION_SEND with fallback Toast if no tenant saved
  - build pass
- **Duration:** 4m 6s

### Task_6_RunAndVerify: Run and verify the full Tenant Management App with Authentication and Intents, instruct critic_agent to verify application stability (no crashes), confirm alignment with user requirements, and report critical UI issues.
- **Status:** COMPLETED
- **Updates:** Verified all flows on phone emulator: LoginActivity launcher, RegisterActivity account creation with email passing, Login to MainActivity navigation with email extra, login Toast, field validation errors, tenant saving, ACTION_DIAL call tenant dialer, and ACTION_SEND share chooser. Zero crashes, zero errors.
- **Acceptance Criteria:**
  - app does not crash
  - build pass
  - make sure all existing tests pass
- **Duration:** 15m 48s

