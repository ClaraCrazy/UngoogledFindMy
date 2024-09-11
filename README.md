# Ungoogled FindMy
This app helps to locate a lost smartphone through the use of conventional SMS. 

<a href="https://github.com/claracrazy/UngoogledFindMy/releases/latest"><img src="http://yt3dl.net/images/apk-download-badge.png" alt="Get it on Github" height="100"></a>

## Screenshots
| Homescreen | SMS Chat
|:-:|:-:|
| <img src="/images/home.png" alt="Homescreen" width="190" height="390.641"> | <img src="/images/sms.png" alt="Preview" width="190" height="390.641"> |

## Usage
Send an SMS to the device you want to locate in order to retrieve information about it.

**Synopsis**
<br/>
```activation_command password option```

**Default values**
<br/>
* The default value for ```activation_command``` is ```sudo```
* The default value for ```password``` is ```systemctl```. It's highly encouraged to change it

**Options**
Option | Explaination | Required permission
-------|:------------|--------------------|
locate | Will return the most accurate set of coordinates possible and a link to them pinpointed to OpenStreetMap | Location
cellinfo | Will return a set of uniquely identifiable information about cell towers near the phone. You can then put this information on [OpenCellId](https://opencellid.org/) to individuate the smartphone's approximate location | Location
battery | Will return battery infos | None |
lock | Will  lock down the smartphone | Device Administrator |
show "message" | Will show a message on the screen, even when it's locked. | Overlay |
callme | You will receive a call from the lost smartphone | Calls, Overlay |
wifi | Will return Wi-Fi infos | Location |
wifi-on | Will enable Wi-Fi (Only API < 29) | None |
wifi-off | Will disable Wi-Fi (Only API < 29) | None |
ring | Will make the smartphone ring | Overlay |

### Auto enabling location

The app is able to automatically enable location if it is off, but you need to grant a specific permission through adb.

To grant the permission you need to do the following:
1. Install [LADB](https://play.google.com/store/apps/details?id=com.draco.ladb)
2. In the Android Developer Options enable Wireless debugging (Device Settings > Developer Options > Wireless Debugging)
3. Connect LADB to your phone (You might have to use split-screen with both apps, since the settings app will minimize the OTP window otherwise):
   * Click the Wireless Debugging option, this will bring Wireless Debugging Configuration
   * Click Pair Device with pairing code, this will show a wifi Pairing Code with device ip & port to be used in LADB to pair
5. Let LADB connect, wait for it to say "Success" and then run the following command:

```
adb shell pm grant com.claracrazy.ungoogledfindmy android.permission.WRITE_SECURE_SETTINGS
```


## Security
### Security measures in place

This application manages sensitive data. As such, it strives to be as secure as possible. There are two walls to resist a potential malicious individual:
* Password (mandatory): The default password is ```systemctl```. Change it to something more secure to enhance your protection. Furthermore, you probably know that SMS are not encrypted. This means that it is advised to change your password when you send to your smartphone messages containing it in order to deny access to attackers as soon as possible (unlikely and costly attack, yet let's try to prevent any displeasing scenario).
* Whitelist (optional): Whitelist numbers are the only numbers that the app will accept communications from.

### Legit apks
GitHub's releases section is the only place where I am uploading apks. 

### Antivirus' false positives
Some antivirus falsely report it's a malware due to the app's extensive demanding permissions.

## More info
There is already Google Find My Device, but I wanted a free and open source alternative (even tho it is suggested to keep Google's, unless you do not have Play Services and/or wanting to go full-in about privacy). There is already a good FOSS alternative, [Find My Device](https://gitlab.com/Nulide/findmydevice) (from which I took inspiration from), but wanted to change it a little. Xfarrow did [fork](https://www.github.com/xfarrow/FindMyDevice) it, and eventually they decided to create [their own project](https://github.com/xfarrow/locatemydevice), which in turn lead to this fork.

**Other:**
* This software is licensed under the GNU General Public License v3.0. Click [here](https://github.com/claracrazy/UngoogledFindMy/blob/main/LICENSE) for more information;
* As specified in the license, the software is provided "as is" with no warranty;
* This software is not meant to be the only installed device locator. It is strongly advised to use it in conjunction with Google Find My Device; in fact it might suffer from a bug or might be unresponsive when you need it the most;

## ❤️ Support me

<!--
Pwease support me >.<
-->  

<p>Since I work full-time on open-source projects spread across my organizations, my only source of income is donations from people like you that use & appreciate my stuff. So, if you can spare a dollar or two, I would really appreciate that. All the money goes towards paying rent, essentials like food, drinks etc, and most importantly it will be used to fuel my cookie addiction🍪<br></p>

**Crypto:**
- **XMR**: `42xc4qPZyfi4wzAkCBXSoMSo3BLDS8946J89JXDqtT5gRj6uYpfhjQF12NLPMxtqGDL2RxoWXjB73iYdBP8DX7SqGvdbdtb`<br>
- **USDT (TRX20):** `TWg6VDUBase3HDA6RxAwTVjQw4SbxoGyqZ`<br>
- **USDT (ERC20):** `0x841251438A8Fb2B16298C15B10feA9Fd2cEA3405`<br>
- **Doge:** `DCKAFtgw6686uEMaFzZfCtUajS9VjPJLMm`<br>
- **BTC:** `bc1qje8qy7gpudm8hhyx43n9xndg7d8xj5f7dh6m4p`<br>

**Fiat:**
- **[Patreon](https://patreon.com/crazyco) (Fee: 8%\*)**: ❤️ Account needed, subscription with perks
- **[ko-fi](https://ko-fi.com/crazyco) (Fee: 2%\*)**: No account needed, subscription or one-time donation
- **[Wire-transfer](https://bunq.me/ClaraK) (Fee: 0%\*)**: No account needed, one-time donation
- **[Paypal](https://paypal.me/ClaraCrazy)\*\* (Fee: 2%\*)**: Account needed, one-time donation

\* Fee is calculated by how much I will lose when cashing out<br>
\*\* Please make sure to select *Friends and Family*<br><br>
**Thanks for all your support <3**
