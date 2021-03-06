package chandu0101.scalajs.rn.components

import chandu0101.scalajs.rn.ReactNative
import japgolly.scalajs.react.ReactComponentU_

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, undefined}

/**
 * Created by chandrasekharkode on 4/1/15.
 *
 * key: PropTypes.string,
   style: PropTypes.Any,
    value: PropTypes.number,
    minimumValue: PropTypes.number,
    maximumValue: PropTypes.number,
    onValueChange: PropTypes.func,
    onSlidingComplete: PropTypes.func,
 */


object SliderIOS {

  def apply(style: UndefOr[js.Any] = undefined,
            minimumValue: UndefOr[Int] = undefined,
            onSlidingComplete: UndefOr[js.Function] = undefined,
            key: UndefOr[String] = undefined,
            onValueChange: UndefOr[(Double) => _] = undefined,
            value: UndefOr[Int] = undefined,
            maximumValue: UndefOr[Int] = undefined) = {
    val p = js.Dynamic.literal()
    style.foreach(v => p.updateDynamic("style")(v))
    minimumValue.foreach(v => p.updateDynamic("minimumValue")(v))
    onSlidingComplete.foreach(v => p.updateDynamic("onSlidingComplete")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    onValueChange.foreach(v => p.updateDynamic("onValueChange")(v))
    value.foreach(v => p.updateDynamic("value")(v))
    maximumValue.foreach(v => p.updateDynamic("maximumValue")(v))
    val f = ReactNative.createFactory(ReactNative.SliderIOS)
    f(p).asInstanceOf[ReactComponentU_]
  }
}
     
