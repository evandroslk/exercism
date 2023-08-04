package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LogLevelsTest {

	@Test
	void message_with_leading_and_trailing_white_space() {
		assertThat(LogLevels.message("[WARNING]:   \tTimezone not set  \r\n")).isEqualTo("Timezone not set");
	}

	@Test
	void info_message() {
		assertThat(LogLevels.message("[INFO]: File moved")).isEqualTo("File moved");
	}

	@Test
	void error_message() {
		assertThat(LogLevels.message("[ERROR]: Stack overflow")).isEqualTo("Stack overflow");
	}

	@Test
	void reformat_with_leading_and_trailing_white_space() {
		assertThat(LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n")).isEqualTo("Corrupt disk (error)");
	}

	@Test
	void info_log_level() {
		assertThat(LogLevels.logLevel("[INFO]: Timezone changed")).isEqualTo("info");
	}

	@Test
	void error_reformat() {
		assertThat(LogLevels.reformat("[ERROR]: Segmentation fault")).isEqualTo("Segmentation fault (error)");
	}

	@Test
	void error_log_level() {
		assertThat(LogLevels.logLevel("[ERROR]: Disk full")).isEqualTo("error");
	}

	@Test
	void info_reformat() {
		assertThat(LogLevels.reformat("[INFO]: Disk defragmented")).isEqualTo("Disk defragmented (info)");
	}

	@Test
	void warning_reformat() {
		assertThat(LogLevels.reformat("[WARNING]: Decreased performance")).isEqualTo("Decreased performance (warning)");
	}

	@Test
	void warning_log_level() {
		assertThat(LogLevels.logLevel("[WARNING]: Unsafe password")).isEqualTo("warning");
	}

	@Test
	void warning_message() {
		assertThat(LogLevels.message("[WARNING]: Disk almost full")).isEqualTo("Disk almost full");
	}

}
