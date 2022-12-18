package com.example.quizzer

object Constants {

    const val USER_NAME: String = "username"
    const val TOTAL_QUESTIONS: String = "total_ques"
    const val CORRECT_ANSWERS: String = "correct_ans"

    fun getQuestions(): ArrayList<Questions>{
        val questions = ArrayList<Questions>()
        val ques1 = Questions(
            1,
            "Who invented the first Computer?",
            R.drawable.monitor,
            "Bill Moggridge",
            "Charles Babbage",
            "Boris Babayan",
            "Seymour Cray",
            2
        )
        val ques2 = Questions(
            2,
            "The computer lab is located in which room at Mount Prevost?",
            R.drawable.monitor,
            "112",
            "The computer lab room",
            "10101101",
            "110",
            4
        )
        val ques3 = Questions(
            3,
            "What is it called when you sign on to your computer account?",
            R.drawable.monitor,
            "Sign-in",
            "Log-in",
            "User-name",
            "Log",
            2
        )
        val ques4 = Questions(
            4,
            "At an event, you could participate in an activity that requires you to run all around searching for particular items.  On the computer, you can do the same thing, using Google and other search techniques to find images, links, and information. It is called a ________ Hunt.",
            R.drawable.monitor,
            "Rabbit",
            "Web",
            "Wild Goose",
            "Scavenger",
            4
        )
        val ques5 = Questions(
            5,
            "An electronic tool that allows information to be input, processed, and output",
            R.drawable.monitor,
            "Operating System",
            "Motherboard",
            "Computer",
            "CPU",
            3
        )
        val ques6 = Questions(
            6,
            "All input data, instructions and data interim to the processes are stored in the_________.",
            R.drawable.monitor,
            "Memory",
            "CPU",
            "Monitor",
            "Printer",
            1
        )
        val ques7 = Questions(
            7,
            "Computers are personal computers (PCs) designed for use by an individual at a fixed location.",
            R.drawable.monitor,
            "Monitor",
            "Desktop",
            "Laptop",
            "Network",
            2
        )
        val ques8 = Questions(
            8,
            "_________ are computers with high processing speeds that provide one or more services to other systems on the network.",
            R.drawable.monitor,
            "Network",
            "Servers",
            "Wi-fi",
            "Internet",
            2
        )
        val ques9 = Questions(
            9,
            "When there are no system problems to be corrected or authorized enhancements to be made, access to the operational environment is limited to _____ and must strictly be controlled.",
            R.drawable.monitor,
            "Managers",
            "Users",
            "Programmers",
            "Systems analysts",
            2
        )
        val ques10 = Questions(
            10,
            "\"Build a system that is effective, reliable, and maintainable.\" best aligns with...",
            R.drawable.monitor,
            "Implementation",
            "Project execution",
            "Software acquisition",
            "Systems design",
            4
        )
        questions.add(ques1)
        questions.add(ques2)
        questions.add(ques3)
        questions.add(ques4)
        questions.add(ques5)
        questions.add(ques6)
        questions.add(ques7)
        questions.add(ques8)
        questions.add(ques9)
        questions.add(ques10)
        return questions
    }
}