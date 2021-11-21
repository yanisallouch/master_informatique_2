import 'package:flutter/material.dart';
import 'package:flutter_hooks/flutter_hooks.dart';
import 'package:flutter_material_theming/material_showcase/material_showcase.dart';

class MaterialShowcasePage extends StatelessWidget {
  const MaterialShowcasePage({Key? key}) : super(key: key);

  static Route go() {
    return MaterialPageRoute<void>(
        builder: (_) => const MaterialShowcasePage());
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Material Showcase'),
      ),
      body: Padding(
        padding: const EdgeInsets.symmetric(
          horizontal: 20,
        ),
        child: ListView(
          children: const [
            SizedBox(height: 20),
            CustomSection(
              title: 'BUTTON',
              child: ButtonsDemo(),
            ),
            CustomSection(
              title: 'FABS',
              child: FabsDemo(),
            ),
            CustomSection(
              title: 'APP BAR',
              child: AppBarDemo(),
            ),
            CustomSection(
              title: 'TAB BAR',
              child: TabBarDemo(),
            ),
            CustomSection(
              title: 'SWITCH, CHECKBOX, RADIO',
              child: SwitchCheckbox(),
            ),
            CustomSection(
              title: 'LINEAR PROGRESS INDICATOR',
              child: LinerProgressIndicatorDemo(),
            ),
            CustomSection(
              title: 'CARD, ALERT DIALOG',
              child: CardDemo(),
            ),
            CustomSection(
              title: 'SNACKBAR',
              child: SnackBarDemo(),
            ),
            CustomSection(
              title: 'TEXT FIELD',
              child: TextFieldDemo(),
            ),
            CustomSection(
              title: 'SLIDER',
              child: SliderDemo(),
            ),
            CustomSection(
              title: 'DATE/TIME PICKER',
              child: DateTimePickerDemo(),
            ),
            CustomSection(
              title: 'TYPOGRAPHY',
              child: TypographyDemo(),
            ),
          ],
        ),
      ),
    );
  }
}

class ButtonsDemo extends StatelessWidget {
  const ButtonsDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisSize: MainAxisSize.min,
      children: [
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          children: [
            ElevatedButton(
              onPressed: () {},
              child: const Text('BUTTON'),
            ),
            OutlinedButton(
              onPressed: () {},
              child: const Text('BUTTON'),
            ),
            TextButton(
              onPressed: () {},
              child: const Text('BUTTON'),
            ),
          ],
        ),
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          children: [
            DropdownButton<String>(
              value: 'One',
              icon: const Icon(Icons.arrow_downward),
              elevation: 16,
              onChanged: (String? newValue) {},
              items: <String>['One', 'Two', 'Free', 'Four']
                  .map<DropdownMenuItem<String>>((String value) {
                return DropdownMenuItem<String>(
                  value: value,
                  child: Text(value),
                );
              }).toList(),
            ),
            PopupMenuButton<int>(
              onSelected: (int result) {},
              itemBuilder: (BuildContext context) => <PopupMenuEntry<int>>[
                const PopupMenuItem<int>(
                  value: 0,
                  child: Text('Working a lot harder'),
                ),
                const PopupMenuItem<int>(
                  value: 1,
                  child: Text('Being a lot smarter'),
                ),
                const PopupMenuItem<int>(
                  value: 2,
                  child: Text('Being a self-starter'),
                ),
                const PopupMenuItem<int>(
                  value: 3,
                  child: Text('Placed in charge of trading charter'),
                ),
              ],
            ),
            IconButton(
              icon: const Icon(Icons.volume_up),
              tooltip: 'Increase volume by 10',
              onPressed: () {},
            )
          ],
        ),
      ],
    );
  }
}

class FabsDemo extends StatelessWidget {
  const FabsDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        FloatingActionButton.small(
          onPressed: () {},
          child: const Icon(Icons.add),
        ),
        FloatingActionButton(
          onPressed: () {},
          child: const Icon(Icons.favorite),
        ),
        FloatingActionButton.large(
          onPressed: () {},
          child: const Icon(Icons.star),
        ),
        FloatingActionButton.extended(
          icon: const Icon(Icons.edit),
          label: const Text('LABEL'),
          onPressed: () {},
        ),
      ],
    );
  }
}

class AppBarDemo extends StatelessWidget {
  const AppBarDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return AppBar(
      title: const Text('Headline 6'),
      actions: [
        IconButton(onPressed: () {}, icon: const Icon(Icons.share)),
        IconButton(onPressed: () {}, icon: const Icon(Icons.save_alt_outlined)),
        IconButton(onPressed: () {}, icon: const Icon(Icons.search)),
      ],
    );
  }
}

class TabBarDemo extends StatelessWidget {
  const TabBarDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const DefaultTabController(
      initialIndex: 1,
      length: 3,
      child: TabBar(
        tabs: <Widget>[
          Tab(
            icon: Icon(Icons.cloud_outlined),
          ),
          Tab(
            icon: Icon(Icons.beach_access_sharp),
          ),
          Tab(
            icon: Icon(Icons.brightness_5_sharp),
          ),
        ],
      ),
    );
  }
}

class SwitchCheckbox extends HookWidget {
  const SwitchCheckbox({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final switchState = useState<bool>(true);
    final checkBoxState = useState<bool>(true);
    final radioState = useState<int>(0);
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        Switch(
          value: switchState.value,
          onChanged: (v) => switchState.value = v,
        ),
        Checkbox(
          value: checkBoxState.value,
          onChanged: (v) => checkBoxState.value = v!,
        ),
        Row(
          mainAxisSize: MainAxisSize.min,
          children: [
            Radio<int>(
              value: 0,
              groupValue: radioState.value,
              onChanged: (v) => radioState.value = v!,
            ),
            Radio<int>(
              value: 1,
              groupValue: radioState.value,
              onChanged: (v) => radioState.value = v!,
            ),
          ],
        )
      ],
    );
  }
}

class LinerProgressIndicatorDemo extends StatelessWidget {
  const LinerProgressIndicatorDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const LinearProgressIndicator(
      value: .75,
    );
  }
}

class CardDemo extends StatelessWidget {
  const CardDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Expanded(
          child: Card(
            child: Padding(
              padding: const EdgeInsets.all(15),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    'Overline',
                    style: Theme.of(context).textTheme.overline,
                  ),
                  const SizedBox(height: 10),
                  Text(
                    'Headline 6',
                    style: Theme.of(context).textTheme.headline6,
                  ),
                  const SizedBox(height: 10),
                  const Text(
                    // ignore: lines_longer_than_80_chars
                    'lorem ipsum onec efficitur diam sed odio molestie venenatis nec non ligula. In pellentesque risus augue, in convallis nibh elementum nec. Morbi vitae felis id libero facilisis ',
                  ),
                ],
              ),
            ),
          ),
        ),
        Expanded(
          child: AlertDialog(
            title: const Text('AlertDialog Title'),
            content: SingleChildScrollView(
              child: ListBody(
                children: const <Widget>[
                  Text('This is a demo alert dialog.'),
                  Text('Would you like to approve of this message?'),
                ],
              ),
            ),
            actions: <Widget>[
              TextButton(
                child: const Text('Approve'),
                onPressed: () {},
              ),
            ],
          ),
        ),
      ],
    );
  }
}

class SnackBarDemo extends StatelessWidget {
  const SnackBarDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        TextButton(
          onPressed: () {
            const snackBar = SnackBar(content: Text('Yay! A SnackBar!'));
            ScaffoldMessenger.of(context).showSnackBar(snackBar);
          },
          child: const Text('Show SnackBar'),
        )
      ],
    );
  }
}

class TextFieldDemo extends StatelessWidget {
  const TextFieldDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: const [
        TextField(
          decoration: InputDecoration(
            label: Text('Label'),
            helperText: 'Helper text',
          ),
        ),
        SizedBox(height: 5),
        TextField(
          decoration: InputDecoration(
            label: Text('Label'),
            errorText: 'Error text',
          ),
        ),
      ],
    );
  }
}

class SliderDemo extends HookWidget {
  const SliderDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final slider = useState<double>(50);
    final rangeSlider = useState<RangeValues>(
      const RangeValues(40, 70),
    );
    return Column(
      children: [
        Slider(
          value: slider.value,
          max: 100,
          divisions: 5,
          label: slider.value.round().toString(),
          onChanged: (double value) {
            slider.value = value;
          },
        ),
        const SizedBox(height: 10),
        RangeSlider(
          values: rangeSlider.value,
          max: 100,
          labels: RangeLabels(
            rangeSlider.value.start.round().toString(),
            rangeSlider.value.end.round().toString(),
          ),
          onChanged: (RangeValues values) {
            rangeSlider.value = values;
          },
        ),
      ],
    );
  }
}

class DateTimePickerDemo extends HookWidget {
  const DateTimePickerDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        ElevatedButton.icon(
          onPressed: () {
            showDatePicker(
              context: context,
              initialDate: DateTime.now(),
              firstDate: DateTime.now(),
              lastDate: DateTime.now().add(
                const Duration(days: 1000),
              ),
            );
          },
          icon: const Icon(Icons.calendar_today),
          label: const Text('Pick Date'),
        ),
        ElevatedButton.icon(
          onPressed: () {
            showTimePicker(
              context: context,
              initialTime: TimeOfDay.now(),
            );
          },
          icon: const Icon(Icons.timer),
          label: const Text('Pick Time'),
        ),
      ],
    );
  }
}

class TypographyDemo extends StatelessWidget {
  const TypographyDemo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          'Headline 1',
          style: Theme.of(context).textTheme.headline1,
        ),
        const SizedBox(height: 10),
        Text(
          'Headline 2',
          style: Theme.of(context).textTheme.headline2,
        ),
        const SizedBox(height: 10),
        Text(
          'Headline 3',
          style: Theme.of(context).textTheme.headline3,
        ),
        const SizedBox(height: 10),
        Text(
          'Headline 4',
          style: Theme.of(context).textTheme.headline4,
        ),
        const SizedBox(height: 10),
        Text(
          'Headline 5',
          style: Theme.of(context).textTheme.headline5,
        ),
        const SizedBox(height: 10),
        Text(
          'Headline 6',
          style: Theme.of(context).textTheme.headline6,
        ),
        const SizedBox(height: 10),
        Text(
          'Subtitle 1',
          style: Theme.of(context).textTheme.subtitle1,
        ),
        const SizedBox(height: 10),
        Text(
          'Subtitle 2',
          style: Theme.of(context).textTheme.subtitle2,
        ),
        const SizedBox(height: 10),
        Text(
          'Body Text 1',
          style: Theme.of(context).textTheme.bodyText1,
        ),
        const SizedBox(height: 10),
        Text(
          'Body Text 2',
          style: Theme.of(context).textTheme.bodyText2,
        ),
        const SizedBox(height: 10),
        Text(
          'Button',
          style: Theme.of(context).textTheme.button,
        ),
        const SizedBox(height: 10),
        Text(
          'Caption',
          style: Theme.of(context).textTheme.caption,
        ),
        const SizedBox(height: 10),
        Text(
          'Overline',
          style: Theme.of(context).textTheme.overline,
        ),
      ],
    );
  }
}
