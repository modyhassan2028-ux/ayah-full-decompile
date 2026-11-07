package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class DefaultCompactOnLaunchCallback implements CompactOnLaunchCallback {
    @Override // io.realm.CompactOnLaunchCallback
    public boolean shouldCompact(long j, long j10) {
        return j > 52428800 && ((double) j10) / ((double) j) < 0.5d;
    }
}
