\\checks if the given string contains all the 26 alphabets
#include <iostream>
using namespace std;
void solve(){
    int flag=0;
    string s;
    cin>>s;
    for(char ch: s){
        flag|=(1<<(ch-'a'));
    }
    if((flag==(1<<26)-1)){
        cout<<"Yes";
    }else{
        cout<<"No";
    }
}
int main(){
solve();
    return 0;
}

\\combinational sequence
#include<iostream>
using namespace std;
void solve(){
  string s;
  cin>>s;
  int l=s.length();
  for(int i=1;i<(1<<l);i++){
      string c="";
      for(int ch=0;ch<l;ch++){
          if((i&(1<<ch))>0){
              c+=s[ch];
          }
      }cout<<c<<endl;
  }
}
int main(){
    solve();
    return 0;
}