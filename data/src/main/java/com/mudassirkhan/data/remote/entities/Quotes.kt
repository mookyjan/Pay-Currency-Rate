package com.mudassirkhan.data.remote.entities

import com.squareup.moshi.Json


data class Quotes (
    var symbol: String = "", var rate: Float = 0f
//    @Json(name = "USDAED")
//    var uSDAED: Double? = null,
//    @Json(name = "USDAFN")
//    var uSDAFN: Double? = null,
//    @Json(name = "USDALL")
//    var uSDALL: Double? = null,
//    @Json(name = "USDAMD")
//    var uSDAMD: Double? = null,
//    @Json(name = "USDANG")
//    var uSDANG: Double? = null,
//    @Json(name = "USDAOA")
//    var uSDAOA: Double? = null,
//    @Json(name = "USDARS")
//    var uSDARS: Double? = null,
//    @Json(name = "USDAUD")
//    var uSDAUD: Double? = null,
//    @Json(name = "USDAWG")
//    var uSDAWG: Double? = null,
//    @Json(name = "USDAZN")
//    var uSDAZN: Double? = null,
//    @Json(name = "USDBAM")
//    var uSDBAM: Double? = null,
//    @Json(name = "USDBBD")
//    var uSDBBD: Double? = null,
//    @Json(name = "USDBDT")
//    var uSDBDT: Double? = null,
//    @Json(name = "USDBGN")
//    var uSDBGN: Double? = null,
//    @Json(name = "USDBHD")
//    var uSDBHD: Double? = null,
//    @Json(name = "USDBIF")
//    var uSDBIF: Double? = null,
//    @Json(name = "USDBMD")
//    var uSDBMD: Int? = null,
//    @Json(name = "USDBND")
//    var uSDBND: Double? = null,
//    @Json(name = "USDBOB")
//    var uSDBOB: Double? = null,
//    @Json(name = "USDBRL")
//    var uSDBRL: Double? = null,
//    @Json(name = "USDBSD")
//    var uSDBSD: Double? = null,
//    @Json(name = "USDBTC")
//    var uSDBTC: Double? = null,
//    @Json(name = "USDBTN")
//    var uSDBTN: Double? = null,
//    @Json(name = "USDBWP")
//    var uSDBWP: Double? = null,
//    @Json(name = "USDBYN")
//    var uSDBYN: Double? = null,
//    @Json(name = "USDBYR")
//    var uSDBYR: Int? = null,
//    @Json(name = "USDBZD")
//    var uSDBZD: Double? = null,
//    @Json(name = "USDCAD")
//    var uSDCAD: Double? = null,
//    @Json(name = "USDCDF")
//    var uSDCDF: Double? = null,
//    @Json(name = "USDCHF")
//    var uSDCHF: Double? = null,
//    @Json(name = "USDCLF")
//    var uSDCLF: Double? = null,
//    @Json(name = "USDCLP")
//    var uSDCLP: Double? = null,
//    @Json(name = "USDCNY")
//    var uSDCNY: Double? = null,
//    @Json(name = "USDCOP")
//    var uSDCOP: Double? = null,
//    @Json(name = "USDCRC")
//    var uSDCRC: Double? = null,
//    @Json(name = "USDCUC")
//    var uSDCUC: Int? = null,
//    @Json(name = "USDCUP")
//    var uSDCUP: Double? = null,
//    @Json(name = "USDCVE")
//    var uSDCVE: Double? = null,
//    @Json(name = "USDCZK")
//    var uSDCZK: Double? = null,
//    @Json(name = "USDDJF")
//    var uSDDJF: Double? = null,
//    @Json(name = "USDDKK")
//    var uSDDKK: Double? = null,
//    @Json(name = "USDDOP")
//    var uSDDOP: Double? = null,
//    @Json(name = "USDDZD")
//    var uSDDZD: Double? = null,
//    @Json(name = "USDEGP")
//    var uSDEGP: Double? = null,
//    @Json(name = "USDERN")
//    var uSDERN: Double? = null,
//    @Json(name = "USDETB")
//    var uSDETB: Double? = null,
//    @Json(name = "USDEUR")
//    var uSDEUR: Double? = null,
//    @Json(name = "USDFJD")
//    var uSDFJD: Double? = null,
//    @Json(name = "USDFKP")
//    var uSDFKP: Double? = null,
//    @Json(name = "USDGBP")
//    var uSDGBP: Double? = null,
//    @Json(name = "USDGEL")
//    var uSDGEL: Double? = null,
//    @Json(name = "USDGGP")
//    var uSDGGP: Double? = null,
//    @Json(name = "USDGHS")
//    var uSDGHS: Double? = null,
//    @Json(name = "USDGIP")
//    var uSDGIP: Double? = null,
//    @Json(name = "USDGMD")
//    var uSDGMD: Double? = null,
//    @Json(name = "USDGNF")
//    var uSDGNF: Double? = null,
//    @Json(name = "USDGTQ")
//    var uSDGTQ: Double? = null,
//    @Json(name = "USDGYD")
//    var uSDGYD: Double? = null,
//    @Json(name = "USDHKD")
//    var uSDHKD: Double? = null,
//    @Json(name = "USDHNL")
//    var uSDHNL: Double? = null,
//    @Json(name = "USDHRK")
//    var uSDHRK: Double? = null,
//    @Json(name = "USDHTG")
//    var uSDHTG: Double? = null,
//    @Json(name = "USDHUF")
//    var uSDHUF: Double? = null,
//    @Json(name = "USDIDR")
//    var uSDIDR: Double? = null,
//    @Json(name = "USDILS")
//    var uSDILS: Double? = null,
//    @Json(name = "USDIMP")
//    var uSDIMP: Double? = null,
//    @Json(name = "USDINR")
//    var uSDINR: Double? = null,
//    @Json(name = "USDIQD")
//    var uSDIQD: Double? = null,
//    @Json(name = "USDIRR")
//    var uSDIRR: Double? = null,
//    @Json(name = "USDISK")
//    var uSDISK: Double? = null,
//    @Json(name = "USDJEP")
//    var uSDJEP: Double? = null,
//    @Json(name = "USDJMD")
//    var uSDJMD: Double? = null,
//    @Json(name = "USDJOD")
//    var uSDJOD: Double? = null,
//    @Json(name = "USDJPY")
//    var uSDJPY: Double? = null,
//    @Json(name = "USDKES")
//    var uSDKES: Double? = null,
//    @Json(name = "USDKGS")
//    var uSDKGS: Double? = null,
//    @Json(name = "USDKHR")
//    var uSDKHR: Double? = null,
//    @Json(name = "USDKMF")
//    var uSDKMF: Double? = null,
//    @Json(name = "USDKPW")
//    var uSDKPW: Double? = null,
//    @Json(name = "USDKRW")
//    var uSDKRW: Double? = null,
//    @Json(name = "USDKWD")
//    var uSDKWD: Double? = null,
//    @Json(name = "USDKYD")
//    var uSDKYD: Double? = null,
//    @Json(name = "USDKZT")
//    var uSDKZT: Double? = null,
//    @Json(name = "USDLAK")
//    var uSDLAK: Double? = null,
//    @Json(name = "USDLBP")
//    var uSDLBP: Double? = null,
//    @Json(name = "USDLKR")
//    var uSDLKR: Double? = null,
//    @Json(name = "USDLRD")
//    var uSDLRD: Double? = null,
//    @Json(name = "USDLSL")
//    var uSDLSL: Double? = null,
//    @Json(name = "USDLTL")
//    var uSDLTL: Double? = null,
//    @Json(name = "USDLVL")
//    var uSDLVL: Double? = null,
//    @Json(name = "USDLYD")
//    var uSDLYD: Double? = null,
//    @Json(name = "USDMAD")
//    var uSDMAD: Double? = null,
//    @Json(name = "USDMDL")
//    var uSDMDL: Double? = null,
//    @Json(name = "USDMGA")
//    var uSDMGA: Double? = null,
//    @Json(name = "USDMKD")
//    var uSDMKD: Double? = null,
//    @Json(name = "USDMMK")
//    var uSDMMK: Double? = null,
//    @Json(name = "USDMNT")
//    var uSDMNT: Double? = null,
//    @Json(name = "USDMOP")
//    var uSDMOP: Double? = null,
//    @Json(name = "USDMRO")
//    var uSDMRO: Double? = null,
//    @Json(name = "USDMUR")
//    var uSDMUR: Double? = null,
//    @Json(name = "USDMVR")
//    var uSDMVR: Double? = null,
//    @Json(name = "USDMWK")
//    var uSDMWK: Double? = null,
//    @Json(name = "USDMXN")
//    var uSDMXN: Double? = null,
//    @Json(name = "USDMYR")
//    var uSDMYR: Double? = null,
//    @Json(name = "USDMZN")
//    var uSDMZN: Double? = null,
//    @Json(name = "USDNAD")
//    var uSDNAD: Double? = null,
//    @Json(name = "USDNGN")
//    var uSDNGN: Double? = null,
//    @Json(name = "USDNIO")
//    var uSDNIO: Double? = null,
//    @Json(name = "USDNOK")
//    var uSDNOK: Double? = null,
//    @Json(name = "USDNPR")
//    var uSDNPR: Double? = null,
//    @Json(name = "USDNZD")
//    var uSDNZD: Double? = null,
//    @Json(name = "USDOMR")
//    var uSDOMR: Double? = null,
//    @Json(name = "USDPAB")
//    var uSDPAB: Double? = null,
//    @Json(name = "USDPEN")
//    var uSDPEN: Double? = null,
//    @Json(name = "USDPGK")
//    var uSDPGK: Double? = null,
//    @Json(name = "USDPHP")
//    var uSDPHP: Double? = null,
//    @Json(name = "USDPKR")
//    var uSDPKR: Double? = null,
//    @Json(name = "USDPLN")
//    var uSDPLN: Double? = null,
//    @Json(name = "USDPYG")
//    var uSDPYG: Double? = null,
//    @Json(name = "USDQAR")
//    var uSDQAR: Double? = null,
//    @Json(name = "USDRON")
//    var uSDRON: Double? = null,
//    @Json(name = "USDRSD")
//    var uSDRSD: Double? = null,
//    @Json(name = "USDRUB")
//    var uSDRUB: Double? = null,
//    @Json(name = "USDRWF")
//    var uSDRWF: Double? = null,
//    @Json(name = "USDSAR")
//    var uSDSAR: Double? = null,
//    @Json(name = "USDSBD")
//    var uSDSBD: Double? = null,
//    @Json(name = "USDSCR")
//    var uSDSCR: Double? = null,
//    @Json(name = "USDSDG")
//    var uSDSDG: Double? = null,
//    @Json(name = "USDSEK")
//    var uSDSEK: Double? = null,
//    @Json(name = "USDSGD")
//    var uSDSGD: Double? = null,
//    @Json(name = "USDSHP")
//    var uSDSHP: Double? = null,
//    @Json(name = "USDSLL")
//    var uSDSLL: Double? = null,
//    @Json(name = "USDSOS")
//    var uSDSOS: Double? = null,
//    @Json(name = "USDSRD")
//    var uSDSRD: Double? = null,
//    @Json(name = "USDSTD")
//    var uSDSTD: Double? = null,
//    @Json(name = "USDSVC")
//    var uSDSVC: Double? = null,
//    @Json(name = "USDSYP")
//    var uSDSYP: Double? = null,
//    @Json(name = "USDSZL")
//    var uSDSZL: Double? = null,
//    @Json(name = "USDTHB")
//    var uSDTHB: Double? = null,
//    @Json(name = "USDTJS")
//    var uSDTJS: Double? = null,
//    @Json(name = "USDTMT")
//    var uSDTMT: Double? = null,
//    @Json(name = "USDTND")
//    var uSDTND: Double? = null,
//    @Json(name = "USDTOP")
//    var uSDTOP: Double? = null,
//    @Json(name = "USDTRY")
//    var uSDTRY: Double? = null,
//    @Json(name = "USDTTD")
//    var uSDTTD: Double? = null,
//    @Json(name = "USDTWD")
//    var uSDTWD: Double? = null,
//    @Json(name = "USDTZS")
//    var uSDTZS: Double? = null,
//    @Json(name = "USDUAH")
//    var uSDUAH: Double? = null,
//    @Json(name = "USDUGX")
//    var uSDUGX: Double? = null,
//    @Json(name = "USDUSD")
//    var uSDUSD: Int? = null,
//    @Json(name = "USDUYU")
//    var uSDUYU: Double? = null,
//    @Json(name = "USDUZS")
//    var uSDUZS: Double? = null,
//    @Json(name = "USDVEF")
//    var uSDVEF: Double? = null,
//    @Json(name = "USDVND")
//    var uSDVND: Double? = null,
//    @Json(name = "USDVUV")
//    var uSDVUV: Double? = null,
//    @Json(name = "USDWST")
//    var uSDWST: Double? = null,
//    @Json(name = "USDXAF")
//    var uSDXAF: Double? = null,
//    @Json(name = "USDXAG")
//    var uSDXAG: Double? = null,
//    @Json(name = "USDXAU")
//    var uSDXAU: Double? = null,
//    @Json(name = "USDXCD")
//    var uSDXCD: Double? = null,
//    @Json(name = "USDXDR")
//    var uSDXDR: Double? = null,
//    @Json(name = "USDXOF")
//    var uSDXOF: Double? = null,
//    @Json(name = "USDXPF")
//    var uSDXPF: Double? = null,
//    @Json(name = "USDYER")
//    var uSDYER: Double? = null,
//    @Json(name = "USDZAR")
//    var uSDZAR: Double? = null,
//    @Json(name = "USDZMK")
//    var uSDZMK: Double? = null,
//    @Json(name = "USDZMW")
//    var uSDZMW: Double? = null,
//    @Json(name = "USDZWL")
//    var uSDZWL: Double? = null
)