package com.app.friendlycompetitionjapanmodule2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.friendlycompetitionjapanmodule2.R
import com.app.friendlycompetitionjapanmodule2.ui.theme.FriendlyCompetitionJapanModule2Theme

@Composable
fun Detail() {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(MaterialTheme.colorScheme.background)
  ) {
    DetailsPageHeader(onBack = {})
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
    ) {
      Text(
        text = "Strong cold air coming tonight! Guangdong lowest break 0! As for the weather in Guangzhou",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 22.sp,
      )
      Spacer(Modifier.height(12.dp))

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(24.dp)
      ) {
        Column(
          modifier = Modifier
            .weight(0.8f)
            .verticalScroll(rememberScrollState()),
          verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
          Text("by dkfj  lfkd ", fontWeight = FontWeight.Bold)
          Text("Feb 20, 2024")


          Image(
            painter = painterResource(R.drawable.new_6_image_3),
            contentDescription = null,
            modifier = Modifier
              .fillMaxWidth()
              .aspectRatio(16f / 9f)
          )

          Text(
            "These days, Guangdong is so warm that you wear short sleeves\n" +
                "\n" +
                "On February 20, most of the province\n" +
                "\n" +
                "The maximum temperature has risen by 1~5°C\n" +
                "\n" +
                "[/images/top_new_1.png]\n" +
                "\n" +
                "However, don't rush to collect thick clothes just yet!\n" +
                "\n" +
                "Because next\n" +
                "\n" +
                "The weather in Guangdong will experience again\n" +
                "\n" +
                "\"All year round\"\n" +
                "\n" +
                "[/images/top_new_2.gif]\n" +
                "\n" +
                "Today (February 21), the cold air enters Guangdong at night, and Guangdong will usher in a \"roller coaster\" cooling\n" +
                "\n" +
                "In some areas, the temperature can reach more than 10°C\n" +
                "\n" +
                "Temperatures will return to single digits in some areas\n" +
                "\n" +
                "❄\n" +
                "\n" +
                "Blast freezing again\n" +
                "\n" +
                "Strong cold air moves south, cooling and rainfalling\n" +
                "\n" +
                "According to the forecast of the Meteorological Observatory, from February 22nd to 25th, the temperature in Guangdong dropped significantly due to the influence of strong cold air.\n" +
                "\n" +
                "Among them, the strong cold air front affected northern Guangdong from the night of the 21st to the early morning of the 22nd, Guangzhou on the night of the 22nd, and the southern coast on the morning of the 23rd.\n" +
                "\n" +
                "[/images/top_new_3.png]\n" +
                "\n" +
                "Heat before cooling\n" +
                "\n" +
                "▼\n" +
                "\n" +
                "According to the forecast of the Guangdong Meteorological Observatory\n" +
                "\n" +
                "Before the temperature drops, until the day of the 21st\n" +
                "\n" +
                "Guangdong remained relatively stable and the temperature was warming\n" +
                "\n" +
                "Among them, the maximum temperature in Leizhou Peninsula, the eastern part of the Pearl River Delta, eastern Guangdong and northeast Guangdong during the day on the 21st can be close to or reach 30 °C.\n" +
                "\n" +
                "[/images/top_new_4.png]\n" +
                "\n" +
                "The Guangdong Meteorological Observatory predicts that the maximum temperature in Guangdong during the day on February 21 can approach or reach 30 °C.\n" +
                "\n" +
                "But then came a big cooling\n" +
                "\n" +
                "The weather in Guangdong will be hot first and then cold\n" +
                "\n" +
                "Rush 30 ° C from the local maximum temperature\n" +
                "\n" +
                "Sprint to the lowest temperature to 0°C\n" +
                "\n" +
                "Taking Guangzhou as an example, the maximum temperature will reach 26 °C on the 22nd, but this does not prevent the minimum temperature during the day on the 23rd from only 12 °C, and the weather will be gloomy and cold.\n" +
                "\n" +
                "[/images/top_new_5.png]\n" +
                "\n" +
                "[/images/top_new_6.png]\n" +
                "\n" +
                "Damp turns cold\n" +
                "\n" +
                "▼\n" +
                "\n" +
                "Strong cold air on the way south\n" +
                "\n" +
                "It may also be resisted by strong warm and humid air currents\n" +
                "\n" +
                "The process of confrontation between cold and warm air will give some areas\n" +
                "\n" +
                "Bring rainy weather\n" +
                "\n" +
                "Light to moderate rain and locally heavy rain in northern Shaoguan, Qingyuan and Zhaoqing (localized freezing rain, sleet and freezing rain in high-altitude mountainous areas).\n" +
                "\n" +
                "The rain in Guangzhou is likely to arrive on February 22. From the afternoon of February 22, strong cold air affected Guangzhou from north to south, bringing significant cooling and light rain, and the gusts on land increased to 5~6, and gusts of 6~7 in the port area and highlands.\n" +
                "\n" +
                "On the other hand\n" +
                "\n" +
                "Temperatures can also drop rapidly\n" +
                "\n" +
                "It is expected that the cities and counties of Shaoguan, Qingyuan, Zhaoqing, and northern Heyuan will drop by 10~15 °C, the southern cities and counties will drop by 4~6 °C, and the rest of the cities and counties will drop by 6~9 °C.\n" +
                "\n" +
                "The lowest temperature in the process: Shaoguan and Qingyuan 3~5 °C (minus 2~0 °C in high-altitude mountainous areas, locally frozen), 14~18 °C in the southern coast, and 9~13 °C in the rest of the cities and counties (about 11 °C in the urban area of Guangzhou).\n" +
                "\n" +
                "It was hot, cold and rainy\n" +
                "\n" +
                "But there is still good news~\n" +
                "\n" +
                "▼\n" +
                "\n" +
                "The weather that Cantonese people are most afraid of - back to Nantian\n" +
                "\n" +
                "It will be possible after the arrival of cold air\n" +
                "\n" +
                "Say goodbye to Nantian\n" +
                "\n" +
                "The specific weather forecast is as follows\n" +
                "\n" +
                "Specific weather forecast for Guangdong\n" +
                "\n" +
                "▼\n" +
                "\n" +
                "On the 21st, there was light to moderate rain in Shaoguan and Qingyuan, scattered light rain in the rest of the cities and counties, and (light) fog in the morning and evening. The lowest temperature in the morning: 18~20 °C in cities and counties in northern and eastern Guangdong, and 20~23 °C in most other cities and counties.\n" +
                "\n" +
                "From the 22nd to the 23rd, there was light to moderate rain and locally heavy rain in Shaoguan, Qingyuan, and Zhaoqing (local freezing rain or sleet in high-altitude mountainous areas), and scattered light rain in other cities and counties. The temperature dropped significantly, the lowest temperature: Shaoguan, Qingyuan 3~5 °C (high-altitude mountainous areas minus 1~2 °C, local freezing), the north of Heyuan, the north of Meizhou and the north of Zhaoqing 6~9 °C, the southern coast 16~20 °C, the rest of the cities and counties 10~15 °C. Wind gusts of 5~7 on land and in the Pearl River Estuary.\n" +
                "\n" +
                "On the 24th and 25th, the cold weather maintained, with light rain in Shaoguan, Qingyuan, and Zhaoqing (local freezing rain or sleet in high-altitude mountainous areas), and scattered light rain in other cities and counties. Minimum temperature: Shaoguan and Qingyuan 3~5 °C (minus 2~0 °C in high-altitude mountainous areas, locally frozen), 6~9 °C in the north of Heyuan, Meizhou and Zhaoqing in the north, 14~18 °C in the southern coast, and 10~14 °C in the rest of the cities and counties.\n" +
                "\n" +
                "Specific weather forecast for Guangzhou\n" +
                "\n" +
                "▼\n" +
                "\n" +
                "From the afternoon of the 22nd to the 24th, under the influence of strong cold air, the wind increased, the temperature dropped significantly and accompanied by light rain, of which the strong cold air front affected our city from north to south from the afternoon of the 22nd, and entered the urban area at night。\n" +
                "\n" +
                "On the 25th-26th, the cold air continued to replenish, the cold weather maintained, and the lowest temperature in the process will occur on the morning of the 26th: 8~10 °C in the north, 10~11 °C in the middle, and 12~13 °C in the south.\n" +
                "\n" +
                "Research and judgment of early warning signals\n" +
                "\n" +
                "▼\n" +
                "\n" +
                "22nd morning to morning\n" +
                "\n" +
                "All districts in the city will release it one after another\n" +
                "\n" +
                "Yellow Cold Warning Signal\n" +
                "\n" +
                "[/images/top_new_7.png]\n" +
                "\n" +
                "[/images/top_new_8.png]\n" +
                "\n" +
                "The meteorological department reminds that after the influence of strong cold air\n" +
                "\n" +
                "The temperature in most parts of Guangdong will drop significantly\n" +
                "\n" +
                "Please residents everywhere\n" +
                "\n" +
                "Pay attention to the transition of warm and cold weather, and add clothes in time to keep warm\n" +
                "\n" +
                "Take precautions against cold and wind\n" +
                "\n" +
                "Source: China Guangzhou Release, Guangdong Weather, Guangzhou Weather, Guangzhou Daily, Yangcheng Evening News"
          )
        }
        Column(
          modifier = Modifier.weight(0.4f)
        ) {
          repeat(3) {
            NewsCard()
          }
        }

      }




      Text("by Yfdhlkf fkd", fontWeight = FontWeight.Bold)
    }
  }


}

@Composable
private fun DetailsPageHeader(onBack: () -> Unit) {
  Column(

  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween
    ) {


      Image(
        painter = painterResource(R.drawable.home_page_1),
        contentDescription = null,
        modifier = Modifier
          .width(20.dp)
          .clickable(onClick = { }),
      )
      Image(
        painter = painterResource(R.drawable.logo),
        contentDescription = null,
        modifier = Modifier.size(60.dp),
        contentScale = ContentScale.Crop
      )

      Image(
        painter = painterResource(R.drawable.search),
        contentDescription = null,
        modifier = Modifier
          .width(20.dp)
          .clickable(onClick = { }),
      )


    }
    HorizontalDivider(modifier = Modifier.fillMaxWidth())
  }
}

@Preview
@Composable
private fun Preview_Details() {
  FriendlyCompetitionJapanModule2Theme() { Detail() }

}