import React, { Component } from 'react'
import ProjectItem from './Project/ProjectItem';


export class Dashboard extends Component {
  render() {
    return (
    <div>
      <h1>Welcome to the Dashboard</h1>
      <ProjectItem/>
      </div>
    )
  }
}

export default Dashboard;