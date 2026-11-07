package androidx.media;

import io.realm.RealmFieldTypeConstants;
import java.util.Arrays;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12696a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12697b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12698c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12699d = -1;

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i10 = this.f12699d;
        return i10 != -1 ? i10 : AudioAttributesCompat.c(this.f12698c, this.f12696a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f12697b == audioAttributesImplBase.f12697b) {
            int i10 = this.f12698c;
            int i11 = audioAttributesImplBase.f12698c;
            int iA = audioAttributesImplBase.a();
            if (iA == 6) {
                i11 |= 4;
            } else if (iA == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f12696a == audioAttributesImplBase.f12696a && this.f12699d == audioAttributesImplBase.f12699d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12697b), Integer.valueOf(this.f12698c), Integer.valueOf(this.f12696a), Integer.valueOf(this.f12699d)});
    }

    public final String toString() {
        String strR;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f12699d != -1) {
            sb.append(" stream=");
            sb.append(this.f12699d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i10 = this.f12696a;
        int i11 = AudioAttributesCompat.f12692b;
        switch (i10) {
            case 0:
                strR = "USAGE_UNKNOWN";
                break;
            case 1:
                strR = "USAGE_MEDIA";
                break;
            case 2:
                strR = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strR = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strR = "USAGE_ALARM";
                break;
            case 5:
                strR = "USAGE_NOTIFICATION";
                break;
            case 6:
                strR = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strR = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strR = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strR = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strR = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strR = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strR = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                strR = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                strR = "USAGE_GAME";
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
            default:
                strR = c.r(i10, "unknown usage ");
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                strR = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strR);
        sb.append(" content=");
        sb.append(this.f12697b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f12698c).toUpperCase());
        return sb.toString();
    }
}
