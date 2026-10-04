# Project Plan

Lesson 6 Practical — Building the Tenant Management Screen using XML, ConstraintLayout, View Binding, and Data Binding as detailed in the lesson guide.

## Project Brief

# Project Brief: Tenant Management Screen App

## Features
1. **Tenant List View**: Display a structured list of tenants showing summary details (name, apartment/unit number, rent payment status) using XML layouts and Data Binding.
2. **Tenant Detail View**: Display detailed tenant profiles, contact information, and lease status.
3. **Add & Edit Tenant**: Form interface for adding new tenant records or updating existing details using two-way Data Binding.
4. **Tenant Search & Filter**: Search tenant records by name or filter by unit number and payment status.

## High-Level Tech Stack
- **Language**: Kotlin
- **Data Model**: Kotlin Data Class (`Tenant.kt`)
- **UI Framework & Layout**: Android XML Layouts with `ConstraintLayout`
- **UI Binding**: Android View Binding and Data Binding
- **Architecture**: MVVM (`ViewModel`, `LiveData` / `StateFlow`)
- **Concurrency**: Kotlin Coroutines

## Implementation Steps
**Total Duration:** 20m 10s

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
- **Status:** IN_PROGRESS
- **Updates:** Theme crash fixed in themes.xml. Starting verification again.
- **Acceptance Criteria:**
  - app does not crash
  - build pass
  - make sure all existing tests pass
  - all features verified
- **StartTime:** 2026-10-04 23:45:18 EAT

