import { Coach } from "./Coach";

export class GolfCoach implements Coach{
    getDailyWorkout(): string {
        return "Don't spend too much swinging focus and watch your power";
    }

}