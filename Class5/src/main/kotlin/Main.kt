open class SmartDevice (val name: String, val category: String)
{
    var deviceStatus = "Online"

    open val deviceType = "Unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category)
    {
        deviceStatus = when (statusCode)
        {
            0 -> "Offline"
            1 -> "Online"
            else -> "Unknown"
        }
    }

    open fun turnOn()
    {
        deviceStatus = "On"
        println("Smart device has turned on.")
    }
    open fun turnOff()
    {
        println("Smart device has turned off.")
    }
}

class SmartTvDevice(deviceName : String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory)
{
    override val deviceType = "Smart TV"

    var speakerVolume = 2
        set(value)
        {
            if(value in 0..100)
            {
                field = value
            }
        }

    var channelNumber = 1
        set(value)
        {
            if(value in 0..200)
            {
                field = value
            }
        }

    fun increaseSpeakerVolume()
    {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun increaseChannelNumber()
    {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn()
    {
        super.turnOn()
        println("Smart TV has turned off.")
    }

    override fun turnOff()
    {
        deviceStatus = "Off"
        println("Smart TV has turned off.")
    }
}

class SmartLight(deviceName : String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory)
{
    override val deviceType = "Smart Light"

    var brightnessLevel = 50
        set(value)
        {
            if(value in 0..100)
            {
                field = value
            }
        }

    fun increaseBrightness()
    {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}

class SmartHome(val smartTvDevice : SmartTvDevice, val smartLightDevice: SmartLight)
{
    fun increaseTvVolume()
    {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun turnOffLight()
    {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness()
    {
        smartLightDevice.increaseBrightness()
    }
}

fun main(args: Array<String>)
{
    val smartTvDevice = SmartDevice("Android TV", "Entertainment")

    println("Device name is ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}