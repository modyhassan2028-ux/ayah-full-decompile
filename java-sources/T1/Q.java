package T1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U f7621s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(U u8, int i10) {
        super(0);
        this.f7620r = i10;
        this.f7621s = u8;
    }

    @Override // p241y9.a
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f7620r) {
            case 0:
                U u8 = this.f7621s;
                File file = new File(u8.f7636b.getAbsolutePath() + u8.f7639e);
                U.f(u8, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new Q(this.f7621s, 0).invoke(), 939524096);
                    try {
                        int fd = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = Z.f7652b;
                        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        Z z10 = new Z(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return z10;
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
                break;
            default:
                U u10 = this.f7621s;
                File file2 = new File(u10.f7636b.getAbsolutePath() + u10.f7638d);
                U.f(u10, file2);
                return file2;
        }
    }
}
