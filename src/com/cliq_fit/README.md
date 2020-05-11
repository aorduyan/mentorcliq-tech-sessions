We need to implement a personal workout program.

The program needs to have a configuration part (singleton pattern)
User weight
User height
User age
User gender
User preference (boxing, swimming, running)

The program needs to provide a set of different workouts. (strategy patter)
Every workout has different stages: prepare, exercise, stretching.
Each workout has its unique way of doing all the stages. For example swimming workout: prepare (shoulder and legs round movement), exercise (swim in a pool), stretching (relax in a Jacuzzi). Running working: prepare (walk 5 min), exercise (run for 30 min), stretching (relax your legs)

The program can record the logs and also can work with different apps like google fit, strava, nike club (adapter pattern)
The program can have, avgTimeByYear, shareYourResult,... functionality
Each of these apps have their unique interface of providing the logs data. And our program needs to use their interface as well.

The program needs to work with a Virtual Reality system (bridge patter)
Like wear the glasses and turn your face left/right, run like you are in a jungle...
The implementation on the VR side is not ready yet, but we need to provide library and a mock interface. The real implementation separately.