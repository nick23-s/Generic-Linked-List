/**
 * Represents a person with a name, ID, and birthdate.
 *
 * Copyright [2024] [Nick Shteinberg]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Nick Shteinberg
 * Date: 2024-06-01
 */

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    private String name;
    private String id;
    private LocalDate birthDate;

    public Person(String name, String id, LocalDate birthDate){
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName(){
        return name;
    }

    public String getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Compare persons by birthDate
    @Override
    public int compareTo(Person other) {
        return this.birthDate.compareTo(other.birthDate);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", id = '" + id + '\'' +
                ", birthDate = " + birthDate +
                "}\n";
    }
}
