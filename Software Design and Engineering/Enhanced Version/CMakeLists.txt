cmake_minimum_required(VERSION 3.14)
project(ContactAppTests)

set(CMAKE_CXX_STANDARD 17)

# Force GoogleTest to match our runtime library and debug settings
set(BUILD_GMOCK OFF)
set(INSTALL_GTEST OFF)
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)

include(FetchContent)
FetchContent_Declare(
  googletest
  URL https://github.com/google/googletest/archive/refs/heads/main.zip
)
FetchContent_MakeAvailable(googletest)

add_executable(runTests
    Contact.cpp
    ContactService.cpp
    ContactTest.cpp
    ContactServiceTest.cpp
)

target_link_libraries(runTests gtest gtest_main)

enable_testing()
add_test(NAME AllTests COMMAND runTests)
