package cloud.cholewa.p3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollectionClassTest {

    CollectionClass collectionClass = new CollectionClass();

    @Test
    public void shouldGetAllUsers() {

        //when
        List<User> allUsers = collectionClass.getAllUsers();

        //then
        assertNotNull(allUsers);
        assertEquals(5, allUsers.size());
    }

    @Test
    public void shouldGetAllActiveUsers() {

        //when
        List<User> allActiveUsers = collectionClass.getAllActiveUsers();

        //then
        allActiveUsers.forEach(user -> assertTrue(user.isActive()));

        //using assertJ
        assertThat(allActiveUsers).extracting("active")
                .containsOnly(true)
                .hasSize(2);
    }

    @Test
    public void shouldGetAllInactiveUsers() {

        //when
        List<User> allInactiveUsers = collectionClass.getAllInactiveUsers();

        //then
        assertThat(allInactiveUsers).extracting("active")
                .containsOnly(false)
                .hasSize(3);
    }

    @Test
    public void shouldContainsSpecificUsersInOrder() {

        //when
        List<User> allActiveUsers = collectionClass.getAllActiveUsers();
        //then

        assertThat(allActiveUsers).extracting("active").containsOnly(true);
        assertThat(allActiveUsers).extracting("name")
                .containsExactly("jkowalski", "akowalski");
    }
}
