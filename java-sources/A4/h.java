package A4;

import Z.X;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.khatmah.ui.wrapper.KhatmahWrapper;
import com.ayah.feature.onboarding.OnboardingActivity;
import com.ayah.feature.reminder.ReminderSettingsActivity;
import io.realm.RealmFieldTypeConstants;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f524s;

    public /* synthetic */ h(X x9, int i10) {
        this.f523r = i10;
        this.f524s = x9;
    }

    @Override // p241y9.a
    public final Object invoke() {
        int i10 = this.f523r;
        y yVar = y.f19095a;
        X x9 = this.f524s;
        switch (i10) {
            case 0:
                int i11 = AudioConfigWrapper.f13759u;
                x9.setValue(B4.b.f618r);
                break;
            case 1:
                x9.setValue(Boolean.TRUE);
                break;
            case 2:
                x9.setValue(Boolean.TRUE);
                break;
            case 3:
                x9.setValue(Boolean.FALSE);
                break;
            case 4:
                int i12 = ReminderSettingsActivity.f13864a0;
                x9.setValue(Boolean.FALSE);
                break;
            case 5:
                int i13 = ReminderSettingsActivity.f13864a0;
                x9.setValue(null);
                break;
            case 6:
                x9.setValue(Boolean.TRUE);
                break;
            case 7:
                x9.setValue(Boolean.FALSE);
                break;
            case 8:
                x9.setValue(Boolean.FALSE);
                break;
            case 9:
                x9.setValue(Boolean.FALSE);
                break;
            case 10:
                int i14 = KhatmahWrapper.f13794v;
                x9.setValue(null);
                break;
            case 11:
                x9.setValue(Boolean.FALSE);
                break;
            case 12:
                x9.setValue(Boolean.TRUE);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                x9.setValue(Boolean.FALSE);
                break;
            default:
                int i15 = OnboardingActivity.T;
                x9.setValue(Boolean.TRUE);
                break;
        }
        return yVar;
    }
}
