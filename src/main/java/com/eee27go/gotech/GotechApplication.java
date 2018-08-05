package com.eee27go.gotech;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@Configuration
@MapperScan("com.eee27go.gotech.Dao")
@ComponentScan(basePackages={"com.eee27go.gotech"})
public class GotechApplication {
	private final static Logger logger= LoggerFactory.getLogger(GotechApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GotechApplication.class, args);
		logger.info(
				"                      :;J7, :,                        ::;7:\n" +
				"                      ,ivYi, ,                       ;LLLFS:\n" +
				"                      :iv7Yi                       :7ri;j5PL\n" +
				"                     ,:ivYLvr                    ,ivrrirrY2X,\n" +
				"                     :;r@Wwz.7r:                :ivu@kexianli.\n" +
				"                    :iL7::,:::iiirii:ii;::::,,irvF7rvvLujL7ur\n" +
				"                   ri::,:,::i:iiiiiii:i:irrv177JX7rYXqZEkvv17\n" +
				"                ;i:, , ::::iirrririi:i:::iiir2XXvii;L8OGJr71i\n" +
				"              :,, ,,:   ,::ir@mingyi.irii:i:::j1jri7ZBOS7ivv,\n" +
				"                 ,::,    ::rv77iiiriii:iii:i::,rvLq@huhao.Li\n" +
				"             ,,      ,, ,:ir7ir::,:::i;ir:::i:i::rSGGYri712:\n" +
				"           :::  ,v7r:: ::rrv77:, ,, ,:i7rrii:::::, ir7ri7Lri\n" +
				"          ,     2OBBOi,iiir;r::        ,irriiii::,, ,iv7Luur:\n" +
				"        ,,     i78MBBi,:,:::,:,  :7FSL: ,iriii:::i::,,:rLqXv::\n" +
				"        :      iuMMP: :,:::,:ii;2GY7OBB0viiii:i:iii:i:::iJqL;::\n" +
				"       ,     ::::i   ,,,,, ::LuBBu BBBBBErii:i:i:i:i:i:i:r77ii\n" +
				"      ,       :       , ,,:::rruBZ1MBBqi, :,,,:::,::::::iiriri:\n" +
				"     ,               ,,,,::::i:  @arqiao.       ,:,, ,:::ii;i7:\n" +
				"    :,       rjujLYLi   ,,:::::,:::::::::,,   ,:i,:,,,,,::i:iii\n" +
				"    ::      BBBBBBBBB0,    ,,::: , ,:::::: ,      ,,,, ,,:::::::\n" +
				"    i,  ,  ,8BMMBBBBBBi     ,,:,,     ,,, , ,   , , , :,::ii::i::\n" +
				"    :      iZMOMOMBBM2::::::::::,,,,     ,,,,,,:,,,::::i:irr:i:::,\n" +
				"    i   ,,:;u0MBMOG1L:::i::::::  ,,,::,   ,,, ::::::i:i:iirii:i:i:\n" +
				"    :    ,iuUuuXUkFu7i:iii:i:::, :,:,: ::::::::i:i:::::iirr7iiri::\n" +
				"    :     :rk@Yizero.i:::::, ,:ii:::::::i:::::i::,::::iirrriiiri::,\n" +
				"     :      5BMBBBBBBSr:,::rv2kuii:::iii::,:i:,, , ,,:,:i@petermu.,\n" +
				"          , :r50EZ8MBBBBGOBBBZP7::::i::,:::::,: :,:,::i;rrririiii::\n" +
				"              :jujYY7LS0ujJL7r::,::i::,::::::::::::::iirirrrrrrr:ii:\n" +
				"           ,:  :@kevensun.:,:,,,::::i:i:::::,,::::::iir;ii;7v77;ii;i,\n" +
				"           ,,,     ,,:,::::::i:iiiii:i::::,, ::::iiiir@xingjief.r;7:i,\n" +
				"        , , ,,,:,,::::::::iiiiiiiiii:,:,:::::::::iiir;ri7vL77rrirri::\n" +
				"         :,, , ::::::::i:::i:::i:i::,,,,,:,::i:i:::iir;@Secbone.ii:::\n"+
						"Pied Piper Start! "
		);
	}



}
