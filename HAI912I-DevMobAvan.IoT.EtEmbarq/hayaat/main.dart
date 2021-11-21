import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:quize_app/model/question.dart';

import 'logic/question_inex_cubit.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return BlocProvider<QuestionInexCubit>(
      create: (context) => QuestionInexCubit(),
      child: MaterialApp(
        title: 'Flutter Demo',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        home: const MyQuizPage(title: 'Questions/Réponses'),
      ),
    );
  }
}

class MyQuizPage extends StatefulWidget {
  const MyQuizPage({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  State<MyQuizPage> createState() => _MyQuizPageState();
}

class _MyQuizPageState extends State<MyQuizPage> {
  int _currentQuestionInex = 0;

  List<Question> questionList = [
    Question(questionText: "La bataille de Verdun a duré 10 semaines.", isCorrct: false),
    Question(questionText: "La France n’a jamais gagné la médaille d’or olympique au football (soccer).", isCorrct: false),
    Question(questionText: "La France a dû céder l’Alsace et la Moselle (une région de la Lorraine) à l’Allemagne après la guerre de 1870‑1871.", isCorrct: true),
    Question(questionText: "Marie-Antoinette était l’épouse de Louis XIV (le Roi-Soleil).", isCorrct: false),
    Question(questionText: "Les premières années du 20e siècle ont été surnommées la Belle Époque.", isCorrct: true),
    Question(questionText: "Antoine de Saint-Exupéry, l’auteur du Petit Prince, est mort au cours d’une mission militaire", isCorrct: true),
    Question(questionText: "Jeanne d’Arc a participé à la guerre de Sept Ans (1756‑1763).", isCorrct: false),
    Question(questionText: "Ce sont les ingénieurs militaires de Napoléon qui ont inventé le canon.", isCorrct: false),
    Question(questionText: "Le général de Gaulle était trop jeune pour participer au combat en 1914.", isCorrct: false),
    Question(questionText: "Nicolas Sarkozy a dit : « Comment voulez-vous gouverner un pays où il existe 258 variétés de fromage ? »", isCorrct: false),
  ];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(

        title: Text(widget.title),
        centerTitle: true,
        backgroundColor: Colors.blueGrey,
      ),
      backgroundColor: Colors.blueGrey,
      body: Container(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Center(child: Image.asset("images/france_FR.jpg",width: 250, height: 180,)),

            Padding(
              padding: const EdgeInsets.all(12.0),
              child: Container(
                decoration: BoxDecoration(
                  color: Colors.transparent,
                  borderRadius: BorderRadius.circular(14.4),
                  border: Border.all(
                    color: Colors.blueGrey.shade400,
                    style: BorderStyle.solid
                  )
                ),
                height: 120,
                child: Center(
                    child: BlocBuilder<QuestionInexCubit, QuestionInexState>(
                      builder: (context, state) {
                        return Text(
                            //questionList[_currentQuestionInex].questionText,
                          questionList[(state.questionInex) % questionList.length].questionText,
                            style: const TextStyle(
                              color: Colors.white,
                              fontStyle: FontStyle.italic,
                              fontSize: 16,
                              fontWeight: FontWeight.bold
                            ),);
                      }
                    )),

              ),
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                ElevatedButton(
                  onPressed: ()=> _checkAnswer(true, context),
                  child: const Text("VRAI", style: TextStyle(
                      color: Colors.white
                  ),),
                  style: ElevatedButton.styleFrom(
                    primary: Colors.blueGrey,
                    onPrimary: Colors.black,
                    onSurface: Colors.grey,
                  ),

                ),
                ElevatedButton(
                  onPressed: ()=> _checkAnswer(false, context),
                  child: const Text("FAUX",
                    style: TextStyle(
                      color: Colors.white
                    ),),
                  style: ElevatedButton.styleFrom(
                    primary: Colors.blueGrey,
                    onPrimary: Colors.black,
                    onSurface: Colors.grey,
                  ),

                ),
                ElevatedButton(
                  onPressed: ()=> _nextQuestion(context),
                  child: const Icon(Icons.arrow_forward, color: Colors.white,),
                  style: ElevatedButton.styleFrom(
                    primary: Colors.blueGrey,
                    onPrimary: Colors.black,
                    onSurface: Colors.grey,
                  ),

                ),
              ],
            ),
            Spacer(),
          ],
        ),
      ),

    );
  }

  _checkAnswer(bool userChoice, BuildContext context) {
    if(userChoice == questionList[_currentQuestionInex].isCorrct){
      final snackbar = SnackBar(content: Text("Bien"));
      ScaffoldMessenger.of(context).showSnackBar(snackbar);
    }else{
      final snackbar = SnackBar(content: Text("Pas Bien"));
      ScaffoldMessenger.of(context).showSnackBar(snackbar);
    }
  }

  _nextQuestion(BuildContext context) {
    /*setState(() {
      _currentQuestionInex = (_currentQuestionInex + 1) % questionList.length;
    });*/
    BlocProvider.of<QuestionInexCubit>(context).next();
  }
}
