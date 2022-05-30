let sportsOne: string[] = ["Golf", "Cricket", "Swimming"];

for (let i=0; i<sportsOne.length; i++){
    console.log(sportsOne[i]);
}

// Let's use the simplied for loop
for(let tempSport of sportsOne){

    if (tempSport == "Golf"){
        console.log(tempSport + "<Favorite>");
    } else {
        console.log(tempSport);
    }
}