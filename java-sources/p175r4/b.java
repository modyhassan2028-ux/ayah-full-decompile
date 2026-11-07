package p175r4;

import H9.o;
import com.ayah.feature.audio.service.AyahAudioService;
import java.io.File;
import java.io.FilenameFilter;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21559b;

    public /* synthetic */ b(String str, int i10) {
        this.f21558a = i10;
        this.f21559b = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i10 = this.f21558a;
        String str2 = this.f21559b;
        switch (i10) {
            case 0:
                boolean z10 = AyahAudioService.f13735O;
                j.e(str, "name");
                return o.V0(str, str2);
            default:
                return str.startsWith(str2);
        }
    }
}
