import 'package:flutter/material.dart';

class CustomSection extends StatelessWidget {
  const CustomSection({
    Key? key,
    required this.title,
    required this.child,
  }) : super(key: key);

  final String title;
  final Widget child;

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      mainAxisSize: MainAxisSize.min,
      children: [
        Text(
          title,
          style: Theme.of(context).textTheme.caption,
        ),
        const SizedBox(height: 10),
        child,
        const SizedBox(height: 30),
      ],
    );
  }
}
