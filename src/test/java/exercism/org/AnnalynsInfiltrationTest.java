package exercism.org;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AnnalynsInfiltrationTest {

	@Test
	void canSpyIfEveryoneButPrisonerIsSleeping() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = true;

		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotReleasePrisionerIfOnlyArcherIsAsleepAndPetDogIsAbsent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = false;
		boolean prisionerIsAwake = true;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisionerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void cannotSignalPrisonerIfArcherIsAwakeAndPrisonerIsSleeping() {
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		assertThat(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isFalse();
	}

	@Test
	void cannotSignalPrisonerIfArcherAndPrisonerAreBothSleeping() {
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		assertThat(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isFalse();
	}

	@Test
	void cannotReleasePrisonerIfOnlyKnightIsAwakeAndPetDogIsAbsent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void cannotReleasePrisonerIfEveryoneIsAsleepAndPetDogIsAbsent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void cannotReleasePrisonerIfOnlyPrisonerIsAsleepAndPetDogIsPresent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canSpyIfOnlyKnightIsSleeping() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotReleasePrisonerIfEveryoneIsAwakeAndPetDogIsAbsent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canSpyIfEveryoneIsAwake() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void canExecuteFastAttackIfKnightIsSleeping() {
		boolean knightIsAwake = false;
		assertThat(AnnalynsInfiltration.canFastAttack(knightIsAwake)).isTrue();
	}

	@Test
	void canReleasePrisonerIfOnlyArcherIsAsleepAndPetDogIsPresent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isTrue();
	}

	@Test
	void canReleasePrisonerIfEveryoneIsAsleepAndPetDogIsPresent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isTrue();
	}

	@Test
	void canSpyIfOnlyArcherIsSleeping() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = true;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotExecuteFastAttackIfKnightIsAwake() {
		boolean knightIsAwake = true;
		assertThat(AnnalynsInfiltration.canFastAttack(knightIsAwake)).isFalse();
	}

	@Test
	void cannotReleasePrisonerIfOnlyArcherIsAwakeAndPetDogIsAbsent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canReleasePrisonerIfOnlyKnightIsAwakeAndPetDogIsPresent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isTrue();
	}

	@Test
	void cannotReleasePrisonerIfOnlyKnightIsAsleepAndPetDogIsAbsent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canReleasePrisonerIfOnlyPrisonerIsAwakeAndPetDogIsPresent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isTrue();
	}

	@Test
	void canReleasePrisonerIfOnlyPrisonerIsAwakeAndPetDogIsAbsent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isTrue();
	}

	@Test
	void canSpyIfOnlyPrisonerIsSleeping() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotReleasePrisonerIfOnlyKnightIsAsleepAndPetDogIsPresent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void cannotSpyIfEveryoneIsSleeping() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isFalse();
	}

	@Test
	void cannotReleasePrisonerIfOnlyArcherIsAwakeAndPetDogIsPresent() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canSignalPrisonerIfArcherIsSleepingAndPrisonerIsAwake() {
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = true;
		assertThat(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotReleasePrisonerIfEveryoneIsAwakeAndPetDogIsPresent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		boolean petDogIsPresent = true;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canSpyIfEveryoneButKnightIsSleeping() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = false;
		boolean prisonerIsAwake = false;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotReleasePrisonerIfOnlyPrisonerIsAsleepAndPetDogIsAbsent() {
		boolean knightIsAwake = true;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		boolean petDogIsPresent = false;
		assertThat(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)).isFalse();
	}

	@Test
	void canSpyIfEveryoneButArcherIsSleeping() {
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = false;
		assertThat(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
	}

	@Test
	void cannotSignalPrisonerIfArcherAndPrisonerAreBothAwake() {
		boolean archerIsAwake = true;
		boolean prisonerIsAwake = true;
		assertThat(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isFalse();
	}

}
