package cloud.cholewa.p5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class VoidMethodExampleRefactorTest {

    private VoidMethodExampleRefactor voidMethodExampleRefactor = new VoidMethodExampleRefactor();

    @Test
    public void shouldDeleteExistingFile(@TempDir Path tempDir) throws IOException {
        //given
        Files.createFile(tempDir.resolve("testFile.txt"));

        //when
        boolean deleted = voidMethodExampleRefactor.delete(tempDir, "testFile.txt");
        //then
        assertThat(deleted).isTrue();
    }

    @Test
    public void shouldNotDeleteNoneExistingFile(@TempDir Path tempDir) throws IOException {
        //given

        //when
        boolean deleted = voidMethodExampleRefactor.delete(tempDir, "testFile.txt");
        //then
        assertThat(deleted).isFalse();
    }

    @Test
    public void shouldNotDeleteNoneEmptyDir(@TempDir Path tempDir) throws IOException {
        //given
        Files.createFile(tempDir.resolve("testFile.txt"));
        //when
        boolean deleted = voidMethodExampleRefactor.delete(tempDir, "");
        //then
        assertThat(deleted).isFalse();
    }
}
